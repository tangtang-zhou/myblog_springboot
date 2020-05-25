package com.tang.myblog_springboot;

import com.tang.pojo.*;
import com.tang.service.BlogDetailService;
import com.tang.service.FileService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MyblogSpringbootApplicationTests {
    @Autowired
    FileService fileService;
    @Autowired
    BlogDetailService blogDetailService;

    @Test
    void contextLoads() {
        /*BlogDetail blogDetail = new BlogDetail();
        blogDetail.setBlogId(5);
        blogDetail.setTitle("mybatis-plus");
        blogDetail.setContent("测试保存2");
        blogDetail.setLabelId("1");
        blogDetail.setReadType("2");
        blogDetail.setUserId(2);
        blogDetail.setHeat("1");
        blogDetailService.saveBlog(blogDetail);*/
        //blogDetailService.updateById(blogDetail);
        //blogDetailService.deleteById(11);

        String blogByPage = blogDetailService.getBlogByPage(1, 2);
        System.out.println(blogByPage);


        //blogDetailService.saveBlog(blogDetail);
        /*// 需要构建一个 代码自动生成器 对象      
        AutoGenerator mpg = new AutoGenerator();
        // 配置策略
        // 1、全局配置        
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir"); //当前项目目录
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("汤州");
        gc.setOpen(false);  //是否打开文件夹
        gc.setFileOverride(false); // 是否覆盖        
        gc.setServiceName("%sService"); // 去Service的I前缀
        gc.setIdType(IdType.ID_WORKER);
        gc.setDateType(DateType.ONLY_DATE);
        gc.setSwagger2(true);
        mpg.setGlobalConfig(gc);
        //2、设置数据源        
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/myblog?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);
        //3、包的配置        
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("blog");
        pc.setParent("com.tang");
        pc.setEntity("pojo");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setController("controller");
        mpg.setPackageInfo(pc);
        //4、策略配置        
        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude("blog_detail","blog_sort","collection","collection_sort","comment","follow","img","user"); // 设置要映射的表名        
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true); // 自动lombok；
        strategy.setLogicDeleteFieldName("deleted");// 自动填充配置        
        TableFill gmtCreate = new TableFill("create_time", FieldFill.INSERT);
        TableFill gmtModified = new TableFill("update_time", FieldFill.INSERT_UPDATE);
        ArrayList<TableFill> tableFills = new ArrayList<>();
        tableFills.add(gmtCreate);
        tableFills.add(gmtModified);
        strategy.setTableFillList(tableFills);
        strategy.setRestControllerStyle(true);
        strategy.setControllerMappingHyphenStyle(true); // localhost:8080/hello_id_2        
        mpg.setStrategy(strategy);
        mpg.execute(); //执行*/
    }

}
