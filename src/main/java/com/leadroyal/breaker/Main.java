package com.leadroyal.breaker;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // 功能1：完善已知列表
        // 使用指定的class去完善
//        BreakerUtils.completeDatabase(new String[]{"org.apache.ibatis.datasource.jndi.JndiDataSourceFactory"});
//        // 使用指定的jar去完善
//        BreakerUtils.completeDatabase(new File("C:\\Users\\leadroyal\\.gradle\\caches\\modules-2\\files-2.1\\com.alibaba\\fastjson\\1.2.24\\a2b82688715ee16d874d90229d204daf3efcac8e\\fastjson-1.2.24.jar"));
//        // 使用指定的目录去完善
       //BreakerUtils.completeDatabase(new File("/Users/nano/.m2/repository/"), true);
        BreakerUtils.completeDatabase(new File("/home/sankuai/.m2/repository/"), true);
        //BreakerUtils.completeDatabase(new File("/Library/Java/JavaVirtualMachines/"), true);
       // BreakerUtils.completeDatabase(new File("/opt/meituan/apps/maven-repository/.storage/data/"), true);

        System.out.println(TypeUtils.fnv1a_64("org.apache.cxf.jaxrs.utils.schemas.SchemaHandler"));
        System.out.println(TypeUtils.fnv1a_64_lower("org.apache.commons.jelly.impl.Embedded"));
//
//
//        // 功能2：输入版本号，输出已知和未知的列表
//        BreakerUtils.listDatabase(1242);
//        BreakerUtils.listDatabase();

        // 功能3：输入classname，输出被ban情况
        BreakerUtils.isBanned("org.apache.ignite.cache.jta.jndi.CacheJndiTmLookup");
    }

    private static void burp(){
        String clas = "com.alibaba";

    }
}
