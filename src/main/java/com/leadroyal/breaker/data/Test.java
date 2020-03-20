package com.leadroyal.breaker.data;

import com.leadroyal.breaker.TypeUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Test {
    public static void main(String[] args) {
//test4();
//test1();
        ListWhite();
        System.out.println();
       test5();
    }
    private static void test5(){
        System.out.println(Long.toHexString(-9013707057526259810L));
        System.out.println(TypeUtils.fnv1a_64("org.springframework.dao.NonTransientDataAccessResourceException"));
        System.out.println(TypeUtils.fnv1a_64("org.springframework.security.web.savedrequest.DefaultSavedRequest"));
        System.out.println();
    }

    private static void test4() {
        long[] INTERNAL_WHITELIST_HASHCODES = new long[]{
                0x82E8E13016B73F9EL,
                0x863D2DD1E82B9ED9L,
                0x8B2081CB3A50BD44L,
                0x90003416F28ACD89L,
                0x92F252C398C02946L,
                0x9E404E583F254FD4L,
                0x9F2E20FB6049A371L,
                0xA8AAA929446FFCE4L,
                0xAB9B8D073948CA9DL,
                0xAFCB539973CEA3F7L,
                0xB5114C70135C4538L,
                0xC0FE32B8DC897DE9L,
                0xC59AA84D9A94C640L,
                0xC92D8F9129AF339BL,
                0xCC720543DC5E7090L,
                0xD0E71A6E155603C1L,
                0xD11D2A941337A7BCL,
                0xDB7BFFC197369352L,
                0xDC9583F0087CC2C7L,
                0xDDAAA11FECA77B5EL,
                0xE08EE874A26F5EAFL,
                0xE794F5F7DCD3AC85L,
                0xEB7D4786C473368DL,
                0xF4AA683928027CDAL,
                0xF8C7EF9B13231FB6L,
                0xD45D6F8C9017FAL,
                0x6B949CE6C2FE009L,
                0x76566C052E83815L,
                0x9DF9341F0C76702L,
                0xB81BA299273D4E6L,
                0xD4788669A13AE74L,
                0x111D12921C5466DAL,
                0x178B0E2DC3AE9FE5L,
                0x19DCAF4ADC37D6D4L,
                0x1F10A70EE4065963L,
                0x21082DFBF63FBCC1L,
                0x24AE2D07FB5D7497L,
                0x26C5D923AF21E2E1L,
                0x34CC8E52316FA0CBL,
                0x3F64BC3933A6A2DFL,
                0x42646E60EC7E5189L,
                0x44D57A1B1EF53451L,
                0x4A39C6C7ACB6AA18L,
                0x4BB3C59964A2FC50L,
                0x4F0C3688E8A18F9FL,
                0x5449EC9B0280B9EFL,
                0x54DC66A59269BAE1L,
                0x552D9FB02FFC9DEFL,
                0x557F642131553498L,
                0x604D6657082C1EE9L,
                0x61D10AF54471E5DEL,
                0x64DC636F343516DCL,
                0x73A0BE903F2BCBF4L,
                0x73FBA1E41C4C3553L,
                0x7B606F16A261E1E6L,
                0x7F36112F218143B6L,
                0x7FE2B8E675DA0CEFL
        };

        for (int i = 0; i < INTERNAL_WHITELIST_HASHCODES.length; i++) {
            System.out.println("add(new BlackInfo.BlockItem(" + INTERNAL_WHITELIST_HASHCODES[i] + "L, \"\"));");
        }

        //System.out.println(INTERNAL_WHITELIST_HASHCODES);
    }

    private static void test3() {

        System.out.println("add(new BlackInfo.BlockItem(" + 0x941866E73BEFF4C9L + "L, \"\")); ");
        System.out.println("add(new BlackInfo.BlockItem(" + 0xAC6262F52C98AA39L + "L, \"\")); ");
        System.out.println("add(new BlackInfo.BlockItem(" + 0xAD937A449831E8A0L + "L, \"\")); ");
        System.out.println("add(new BlackInfo.BlockItem(" + 0xAE50DA1FAD60A096L + "L, \"\")); ");
        System.out.println("add(new BlackInfo.BlockItem(" + 0xC8D49E5601E661A9L + "L, \"\")); ");
        System.out.println("add(new BlackInfo.BlockItem(" + 0xDEFC208F237D4104L + "L, \"\")); ");
        System.out.println("add(new BlackInfo.BlockItem(" + 0xF474E44518F26736L + "L, \"\")); ");
        System.out.println("add(new BlackInfo.BlockItem(" + 0x24EC99D5E7DC5571L + "L, \"\")); ");
        System.out.println("add(new BlackInfo.BlockItem(" + 0x25E962F1C28F71A2L + "L, \"\")); ");
        System.out.println("add(new BlackInfo.BlockItem(" + 0x327C8ED7C8706905L + "L, \"\")); ");
        System.out.println("add(new BlackInfo.BlockItem(" + 0x3B0B51ECBF6DB221L + "L, \"\")); ");
        System.out.println("add(new BlackInfo.BlockItem(" + 0x49312BDAFB0077D9L + "L, \"\")); ");
        System.out.println("add(new BlackInfo.BlockItem(" + 0x4BF881E49D37F530L + "L, \"\")); ");
        System.out.println("add(new BlackInfo.BlockItem(" + 0x4DA972745FEB30C1L + "L, \"\")); ");
        System.out.println("add(new BlackInfo.BlockItem(" + 0x5F215622FB630753L + "L, \"\")); ");
    }

    private static void ListWhite() {
        String[] types = new String[]{
                "java.awt.Rectangle",
                "java.awt.Point",
                "java.awt.Font",
                "java.awt.Color",

                "com.alibaba.fastjson.util.AntiCollisionHashMap",

                "com.alipay.sofa.rpc.core.exception.SofaTimeOutException",
                "java.util.Collections.UnmodifiableMap",
                "java.util.concurrent.ConcurrentSkipListMap",
                "java.util.concurrent.ConcurrentSkipListSet",

                "org.springframework.dao.CannotAcquireLockException",
                "org.springframework.dao.CannotSerializeTransactionException",
                "org.springframework.dao.CleanupFailureDataAccessException",
                "org.springframework.dao.ConcurrencyFailureException",
                "org.springframework.dao.DataAccessResourceFailureException",
                "org.springframework.dao.DataIntegrityViolationException",
                "org.springframework.dao.DataRetrievalFailureException",
                "org.springframework.dao.DeadlockLoserDataAccessException",
                "org.springframework.dao.DuplicateKeyException",
                "org.springframework.dao.EmptyResultDataAccessException",
                "org.springframework.dao.IncorrectResultSizeDataAccessException",
                "org.springframework.dao.IncorrectUpdateSemanticsDataAccessException",
                "org.springframework.dao.InvalidDataAccessApiUsageException",
                "org.springframework.dao.InvalidDataAccessResourceUsageException",
                "org.springframework.dao.NonTransientDataAccessException",
                "org.springframework.dao.NonTransientDataAccessResourceException",
                "org.springframework.dao.OptimisticLockingFailureException",
                "org.springframework.dao.PermissionDeniedDataAccessException",
                "org.springframework.dao.PessimisticLockingFailureException",
                "org.springframework.dao.QueryTimeoutException",
                "org.springframework.dao.RecoverableDataAccessException",
                "org.springframework.dao.TransientDataAccessException",
                "org.springframework.dao.TransientDataAccessResourceException",
                "org.springframework.dao.TypeMismatchDataAccessException",
                "org.springframework.dao.UncategorizedDataAccessException",

                "org.springframework.jdbc.BadSqlGrammarException",
                "org.springframework.jdbc.CannotGetJdbcConnectionException",
                "org.springframework.jdbc.IncorrectResultSetColumnCountException",
                "org.springframework.jdbc.InvalidResultSetAccessException",
                "org.springframework.jdbc.JdbcUpdateAffectedIncorrectNumberOfRowsException",
                "org.springframework.jdbc.LobRetrievalFailureException",
                "org.springframework.jdbc.SQLWarningException",
                "org.springframework.jdbc.UncategorizedSQLException",

                "org.springframework.cache.support.NullValue",

                "org.springframework.security.oauth2.common.DefaultExpiringOAuth2RefreshToken",
                "org.springframework.security.oauth2.common.DefaultOAuth2AccessToken",
                "org.springframework.security.oauth2.common.DefaultOAuth2RefreshToken",

                "org.springframework.util.LinkedMultiValueMap",
                "org.springframework.util.LinkedCaseInsensitiveMap",

                "org.springframework.remoting.support.RemoteInvocation",
                "org.springframework.remoting.support.RemoteInvocationResult",

                "org.springframework.security.web.savedrequest.DefaultSavedRequest",
                "org.springframework.security.web.savedrequest.SavedCookie",
                "org.springframework.security.web.csrf.DefaultCsrfToken",
                "org.springframework.security.web.authentication.WebAuthenticationDetails",

                "org.springframework.security.core.context.SecurityContextImpl",
                "org.springframework.security.authentication.UsernamePasswordAuthenticationToken",
                "org.springframework.security.core.authority.SimpleGrantedAuthority",
                "org.springframework.security.core.userdetails.User",


        };
        long[] INTERNAL_WHITELIST_HASHCODES = new long[]{
                0x82E8E13016B73F9EL,
                0x863D2DD1E82B9ED9L,
                0x8B2081CB3A50BD44L,
                0x90003416F28ACD89L,
                0x92F252C398C02946L,
                0x9E404E583F254FD4L,
                0x9F2E20FB6049A371L,
                0xA8AAA929446FFCE4L,
                0xAB9B8D073948CA9DL,
                0xAFCB539973CEA3F7L,
                0xB5114C70135C4538L,
                0xC0FE32B8DC897DE9L,
                0xC59AA84D9A94C640L,
                0xC92D8F9129AF339BL,
                0xCC720543DC5E7090L,
                0xD0E71A6E155603C1L,
                0xD11D2A941337A7BCL,
                0xDB7BFFC197369352L,
                0xDC9583F0087CC2C7L,
                0xDDAAA11FECA77B5EL,
                0xE08EE874A26F5EAFL,
                0xE794F5F7DCD3AC85L,
                0xEB7D4786C473368DL,
                0xF4AA683928027CDAL,
                0xF8C7EF9B13231FB6L,
                0xD45D6F8C9017FAL,
                0x6B949CE6C2FE009L,
                0x76566C052E83815L,
                0x9DF9341F0C76702L,
                0xB81BA299273D4E6L,
                0xD4788669A13AE74L,
                0x111D12921C5466DAL,
                0x178B0E2DC3AE9FE5L,
                0x19DCAF4ADC37D6D4L,
                0x1F10A70EE4065963L,
                0x21082DFBF63FBCC1L,
                0x24AE2D07FB5D7497L,
                0x26C5D923AF21E2E1L,
                0x34CC8E52316FA0CBL,
                0x3F64BC3933A6A2DFL,
                0x42646E60EC7E5189L,
                0x44D57A1B1EF53451L,
                0x4A39C6C7ACB6AA18L,
                0x4BB3C59964A2FC50L,
                0x4F0C3688E8A18F9FL,
                0x5449EC9B0280B9EFL,
                0x54DC66A59269BAE1L,
                0x552D9FB02FFC9DEFL,
                0x557F642131553498L,
                0x604D6657082C1EE9L,
                0x61D10AF54471E5DEL,
                0x64DC636F343516DCL,
                0x73A0BE903F2BCBF4L,
                0x73FBA1E41C4C3553L,
                0x7B606F16A261E1E6L,
                0x7F36112F218143B6L,
                0x7FE2B8E675DA0CEFL
        };
        System.out.println(types.length);
        System.out.println(INTERNAL_WHITELIST_HASHCODES.length);

        Long[] allhashs = new Long[types.length];
        for (int j = 0;j<types.length;j++){
            //全部的66版本白名单
            allhashs[j] = TypeUtils.fnv1a_64(types[j]);

        }
        for (int i = 0; i < types.length ; i++) {

            int a = Arrays.binarySearch(INTERNAL_WHITELIST_HASHCODES, TypeUtils.fnv1a_64(types[i]));
            //66版本白名单获取hash，里面没有匹配的67，说明被删除了？
            if (a < 0) {
                System.out.println(types[i]);
            }


        }





    }

    private static void test2() {

        String a = "{\"\\x4Otype\":\"org\\u002eapache\\u002exbean\\u002epropertyeditor\\u002eJndiConverter\",\"asText\":\"ldap\\u003a//localhost:8888/\"}";


        System.out.println(TypeUtils.fnv1a_64("org.apache.xbean.propertyeditor.JndiConverter"));
    }

    private static void test1() {
        Set<String> set = new HashSet<>();
        File ppath = new File("/Users/nano/.m2/repository/com/alibaba/fastjson/1.2.60/fastjson-1.2.60.jar");
        try {
            readJarFile(set, ppath);
            System.out.println(set);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    //com.alibaba.fastjson.JSONPath$IntOpSegement
    private static void readJarFile(Set<String> set, File ppath) throws IOException {
        ZipFile zipFile = new ZipFile(ppath);
        Enumeration<ZipEntry> entries = (Enumeration<ZipEntry>) zipFile.entries();
        while (entries.hasMoreElements()) {
            ZipEntry entry = entries.nextElement();
            String name = entry.getName();
            if (name.endsWith(".class")) {
                set.add(name.replace(".class", "").replace("/", "."));
            }
        }
    }
}
