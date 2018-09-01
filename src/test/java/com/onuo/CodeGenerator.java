package com.onuo;

import com.google.common.base.CaseFormat;
import freemarker.template.TemplateExceptionHandler;
import org.apache.commons.lang3.StringUtils;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.*;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author edward on 2018/5/11.
 * <p>
 * 代码生成器，根据数据表名称生成对应的Model、MyMapper、Service、Controller简化开发。
 */

class CodeGenerator {
    // JDBC配置，请修改为你项目的实际配置
    // private static final String JDBC_URL = "jdbc:oracle:thin:@39.107.243.53:1521:helowin";
    private static final String JDBC_URL = "jdbc:mysql://47.94.254.108:3306/shoes_shop";
    private static final String JDBC_USERNAME = "shoes";
    private static final String JDBC_PASSWORD = "123456";
    //private static final String JDBC_DIVER_CLASS_NAME = "oracle.jdbc.OracleDriver";
    private static final String JDBC_DIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
    // 项目在硬盘上的基础路径
    private static final String PROJECT_PATH = System.getProperty("user.dir");
    // 模板位置
    private static final String TEMPLATE_FILE_PATH = PROJECT_PATH + "/src/test/resources/generator/template";
    // java文件路径
    private static final String JAVA_PATH = "/src/main/java";
    // 资源文件路径
    private static final String RESOURCES_PATH = "/src/main/resources";
    //
    private static final String BASE_PACKAGE = "com.onuo";
    // 模块名称
    private static final String MODULE_NAME = ".goods";
    // 生成的Service存放路径
    private static final String PACKAGE_PATH_SERVICE = packageConvertPath(BASE_PACKAGE + MODULE_NAME + ".service");
    // 生成的Service实现存放路径
    private static final String PACKAGE_PATH_SERVICE_IMPL = packageConvertPath(BASE_PACKAGE + MODULE_NAME + ".service.impl");
    // 生成的Controller存放路径
    private static final String PACKAGE_PATH_CONTROLLER = packageConvertPath(BASE_PACKAGE + MODULE_NAME + ".controller");

    // @author
    private static final String AUTHOR = "kaikai";
    // @date
    private static final String DATE = new SimpleDateFormat("yyyy/MM/dd").format(new Date());
    private static final boolean isRestful = true;
    private static boolean overwrite = false;

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("可能已存在相关文件，是否覆盖？y/n:");
        if (scanner.next().equals("y")) {
            overwrite = true;
        }
        genCode("shoes_size");
        //genCodeByCustomModelName("输入表名","输入自定义Model名称");
    }

    /**
     * 通过数据表名称生成代码，Model 名称通过解析数据表名称获得，下划线转大驼峰的形式。
     * 如输入表名称 "t_user_detail" 将生成 TUserDetail、TUserDetailMapper、TUserDetailService ...
     *
     * @param tableNames 数据表名称...
     */
    private static void genCode(final String... tableNames) {
        for (final String tableName : tableNames) {
            genCodeByCustomModelName(tableName, null);
        }
    }

    /**
     * 通过数据表名称，和自定义的 Model 名称生成代码
     * 如输入表名称 "t_user_detail" 和自定义的 Model 名称 "User" 将生成 User、UserMapper、UserService ...
     *
     * @param tableName 数据表名称
     * @param modelName 自定义的 Model 名称
     */
    private static void genCodeByCustomModelName(final String tableName, final String modelName) {
        genModelAndMapper(tableName, modelName);
        //genService(tableName, modelName);
        //genController(tableName, modelName);
    }


    private static void genModelAndMapper(final String tableName, String modelName) {
        final Context context = new Context(ModelType.FLAT);
        context.setId("Potato");
        context.setTargetRuntime("MyBatis3Simple");
        context.addProperty(PropertyRegistry.CONTEXT_BEGINNING_DELIMITER, "`");
        context.addProperty(PropertyRegistry.CONTEXT_ENDING_DELIMITER, "`");

        final JDBCConnectionConfiguration jdbcConnectionConfiguration = new JDBCConnectionConfiguration();
        jdbcConnectionConfiguration.setConnectionURL(JDBC_URL);
        jdbcConnectionConfiguration.setUserId(JDBC_USERNAME);
        jdbcConnectionConfiguration.setPassword(JDBC_PASSWORD);
        jdbcConnectionConfiguration.setDriverClass(JDBC_DIVER_CLASS_NAME);
        context.setJdbcConnectionConfiguration(jdbcConnectionConfiguration);

        final PluginConfiguration pluginConfiguration = new PluginConfiguration();
        pluginConfiguration.setConfigurationType("tk.mybatis.mapper.generator.MapperPlugin");
        pluginConfiguration.addProperty("mappers", BASE_PACKAGE + ".common.mapper.MyMapper");
        context.addPluginConfiguration(pluginConfiguration);

        final JavaModelGeneratorConfiguration javaModelGeneratorConfiguration = new JavaModelGeneratorConfiguration();
        javaModelGeneratorConfiguration.setTargetProject(PROJECT_PATH + JAVA_PATH);
        javaModelGeneratorConfiguration.setTargetPackage(BASE_PACKAGE + MODULE_NAME + ".model");
        context.setJavaModelGeneratorConfiguration(javaModelGeneratorConfiguration);

        final SqlMapGeneratorConfiguration sqlMapGeneratorConfiguration = new SqlMapGeneratorConfiguration();
        sqlMapGeneratorConfiguration.setTargetProject(PROJECT_PATH + RESOURCES_PATH);
        sqlMapGeneratorConfiguration.setTargetPackage("mapper/" + MODULE_NAME);
        context.setSqlMapGeneratorConfiguration(sqlMapGeneratorConfiguration);

        final JavaClientGeneratorConfiguration javaClientGeneratorConfiguration = new JavaClientGeneratorConfiguration();
        javaClientGeneratorConfiguration.setTargetProject(PROJECT_PATH + JAVA_PATH);
        javaClientGeneratorConfiguration.setTargetPackage(BASE_PACKAGE + MODULE_NAME + ".dao");
        javaClientGeneratorConfiguration.setConfigurationType("XMLMAPPER");
        context.setJavaClientGeneratorConfiguration(javaClientGeneratorConfiguration);

        final TableConfiguration tableConfiguration = new TableConfiguration(context);
        tableConfiguration.setTableName(tableName);
        if (StringUtils.isNotEmpty(modelName)) {
            tableConfiguration.setDomainObjectName(modelName);
        }
        //tableConfiguration.setGeneratedKey(new GeneratedKey("id", "Oracle", true, null));
        tableConfiguration.setGeneratedKey(new GeneratedKey("id", "MySQL", true, null));
        context.addTableConfiguration(tableConfiguration);

        final List<String> warnings;
        final MyBatisGenerator generator;
        try {
            final Configuration config = new Configuration();
            config.addContext(context);
            config.validate();

            final DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            warnings = new ArrayList<>();
            generator = new MyBatisGenerator(config, callback, warnings);
            generator.generate(null);
        } catch (final Exception e) {
            throw new RuntimeException("生成 Model和 Mapper 失败", e);
        }

        if (generator.getGeneratedJavaFiles().isEmpty() || generator.getGeneratedXmlFiles().isEmpty()) {
            throw new RuntimeException("生成 Model 和 Mapper 失败：" + warnings);
        }
        if (StringUtils.isEmpty(modelName)) {
            modelName = tableNameConvertUpperCamel(tableName);
        }
        System.out.println(modelName + ".java 生成成功");
        System.out.println(modelName + "MyMapper.java 生成成功");
        System.out.println(modelName + "MyMapper.xml 生成成功");
    }

    private static void genService(final String tableName, final String modelName) {
        try {
            final freemarker.template.Configuration cfg = getConfiguration();

            final Map<String, Object> data = new HashMap<>();
            data.put("date", DATE);
            data.put("author", AUTHOR);
            final String modelNameUpperCamel = StringUtils.isEmpty(modelName) ? tableNameConvertUpperCamel(tableName) : modelName;
            data.put("modelNameUpperCamel", modelNameUpperCamel);
            data.put("modelNameLowerCamel", tableNameConvertLowerCamel(tableName));
            data.put("commonPackage", BASE_PACKAGE + ".common");
            data.put("basePackage", BASE_PACKAGE + MODULE_NAME);

            final File file = new File(PROJECT_PATH + JAVA_PATH + PACKAGE_PATH_SERVICE + modelNameUpperCamel + "Service.java");
            if (!file.getParentFile().exists()) {
                final boolean isMake = file.getParentFile().mkdirs();
                if (!isMake) {
                    throw new IOException("新建文件失败");
                }
            }
            cfg.getTemplate("service.ftl").process(data,
                    new FileWriter(file));
            System.out.println(modelNameUpperCamel + "Service.java 生成成功");

            final File file1 = new File(PROJECT_PATH + JAVA_PATH + PACKAGE_PATH_SERVICE_IMPL + modelNameUpperCamel + "ServiceImpl.java");
            if (!file1.getParentFile().exists()) {
                final boolean isMake = file1.getParentFile().mkdirs();
                if (!isMake) {
                    throw new IOException("新建文件失败");
                }
            }
            cfg.getTemplate("service-impl.ftl").process(data,
                    new FileWriter(file1));
            System.out.println(modelNameUpperCamel + "ServiceImpl.java 生成成功");
        } catch (final Exception e) {
            throw new RuntimeException("生成 Service 失败，", e);
        }
    }

    private static void genController(final String tableName, final String modelName) {
        try {
            final freemarker.template.Configuration cfg = getConfiguration();

            final Map<String, Object> data = new HashMap<>();
            data.put("date", DATE);
            data.put("author", AUTHOR);
            final String modelNameUpperCamel = StringUtils.isEmpty(modelName) ? tableNameConvertUpperCamel(tableName) : modelName;
            data.put("baseRequestMapping", modelNameConvertMappingPath(modelNameUpperCamel));
            data.put("modelNameUpperCamel", modelNameUpperCamel);
            data.put("modelNameLowerCamel", CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, modelNameUpperCamel));
            data.put("commonPackage", BASE_PACKAGE+".common");
            data.put("basePackage", BASE_PACKAGE + MODULE_NAME);

            final File file = new File(PROJECT_PATH + JAVA_PATH + PACKAGE_PATH_CONTROLLER + modelNameUpperCamel + "Controller.java");
            if (!file.getParentFile().exists()) {
                final boolean isMake = file.getParentFile().mkdirs();
                if (!isMake) {
                    throw new IOException("新建文件失败");
                }
            }

            if (isRestful) {
                cfg.getTemplate("controller-restful.ftl").process(data, new FileWriter(file));
            } else {
                cfg.getTemplate("controller.ftl").process(data, new FileWriter(file));
            }
            System.out.println(modelNameUpperCamel + "Controller.java 生成成功");
        } catch (final Exception e) {
            throw new RuntimeException("生成 Controller 失败，", e);
        }

    }

    private static freemarker.template.Configuration getConfiguration() throws IOException {
        final freemarker.template.Configuration cfg = new freemarker.template.Configuration(freemarker.template.Configuration.VERSION_2_3_23);
        cfg.setDirectoryForTemplateLoading(new File(TEMPLATE_FILE_PATH));
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.IGNORE_HANDLER);
        return cfg;
    }

    private static String tableNameConvertLowerCamel(final String tableName) {
        return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, tableName.toLowerCase());
    }

    private static String tableNameConvertUpperCamel(final String tableName) {
        return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, tableName.toLowerCase());

    }

    private static String tableNameConvertMappingPath(String tableName) {
        tableName = tableName.toLowerCase();//兼容使用大写的表名
        return "/" + (tableName.contains("_") ? tableName.replaceAll("_", "/") : tableName);
    }

    private static String modelNameConvertMappingPath(final String modelName) {
        final String tableName = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, modelName);
        return tableNameConvertMappingPath(tableName);
    }

    private static String packageConvertPath(final String packageName) {
        return String.format("/%s/", packageName.contains(".") ? packageName.replaceAll("\\.", "/") : packageName);
    }

}
