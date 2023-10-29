package mvel;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mvel2.MVEL;
import org.mvel2.optimizers.OptimizerFactory;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class MvelPerformance {
    @Test
    public void test() {

//        OptimizerFactory.setDefaultOptimizer(OptimizerFactory.DYNAMIC);
        OptimizerFactory.setDefaultOptimizer(OptimizerFactory.SAFE_REFLECTIVE);

        log.error("JVM total:{}, usage:{}", Runtime.getRuntime().totalMemory(), Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());

        Map map = new HashMap<>();
        map.put("적용시기", "1");
        map.put("간편심사대상여부", "2");
        map.put("주요질병분류코드", "2");
        map.put("RATING질병코드", "2");

        map.put("메디컬보험나이", 2);
        map.put("메디컬완치후경과기간_MONTH", 2);
        map.put("메디컬완치후경과기간_WEEK", 2);
        map.put("메디컬진단후경과기간_MONTH", 2);
        map.put("메디컬진단후경과기간_WEEK", 2);

        map.put("메디컬치료여부", "Y");

        map.put("메디컬재발횟수", 2);
        map.put("메디컬입원치료", 2);
        map.put("메디컬통원치료", 2);

        map.put("메디컬합병증여부", "2");
        map.put("치료방법문자열", "2");
        map.put("추가질문지답변문자열1", "2");
        map.put("추가질문지답변문자열2", "2");
        map.put("추가질문지답변문자열3", "2");
        map.put("추가질문지답변문자열4", "2");

        map.put("추가질문답변숫자형1", 2);
        map.put("추가질문답변숫자형2", 2);
        map.put("추가질문답변숫자형3", 2);
        map.put("추가질문답변숫자형4", 2);



        StringBuilder builder = new StringBuilder();

        builder.append("적용시기 < \"2014-10-27 13:00:00\"");
        builder.append(" && ");
        builder.append("[\"H16\",\"H17\",\"H18\",\"H19\",\"H50\",\"H65\",\"H66\",\"H67\",\"H68\",\"H69\",\"H70\",\"H71\",\"H72\",\"H73\",\"H74\",\"H75\",\"H81.0\",\"H83.0\",\"H93\",\"A50\",\"A51\",\"A52\",\"A53\",\"B01\",\"B02\",\"B65\",\"B67\",\"B68\",\"B69\",\"B70\",\"B71\",\"B72\",\"B73\",\"B74\",\"B75\",\"B76\",\"B77\",\"B78\",\"B79\",\"B80\",\"B81\",\"B82\",\"B83\",\"M48\",\"M50\",\"M51\",\"M87\",\"Q66.8\",\"S03\",\"S43\",\"S53\",\"S63\",\"S73\",\"S83\",\"S83.2\",\"S83.3\",\"S83.5\",\"S93.2\",\"M10\",\"N13\",\"N20\",\"N40\",\"N41\",\"N87\",\"Q62\",\"N80\",\"A08.4\",\"B15\",\"D12\",\"K26\",\"K27\",\"K35\",\"K36\",\"K37\",\"K58\",\"K65\",\"K82\",\"O10\",\"O11\",\"O12\",\"O13\",\"O14\",\"O15\",\"O16\",\"T20\",\"T21\",\"T22\",\"T23\",\"T24\",\"T25\",\"T26\",\"T27\",\"T28\",\"T29\",\"T30\",\"T31\",\"T32\",\"J37\",\"J93\"].contains(주요질병분류코드)");
        builder.append(" && ");
        builder.append("[\"B20\",\"B21\",\"B22\",\"B23\",\"B24\",\"C22\",\"C25\",\"C34\",\"C37\",\"C38\",\"C39\",\"C40\",\"C41\",\"C70\",\"C71\",\"C81\",\"C82\",\"C83\",\"C84\",\"C85\",\"C88\",\"C90\",\"C91\",\"C92\",\"C93\",\"C94\",\"C95\",\"C96\",\"E75\",\"E83\",\"F00\",\"F01\",\"F02\",\"F03\",\"F10\",\"F20\",\"F30\",\"F31\",\"F32\",\"F34\",\"F84\"].contains(RATING질병코드)");
        builder.append(" && ");
        builder.append("메디컬보험나이 > 10 && 메디컬보험나이 <= 55");
        builder.append(" && ");
        builder.append("메디컬완치후경과기간_MONTH >= 1 && 메디컬완치후경과기간_MONTH < 12");
        builder.append(" && ");
        builder.append("메디컬완치후경과기간_WEEK >= 2 ");
        builder.append(" && ");
        builder.append("메디컬치료여부 == \"1\" ");
        builder.append(" && ");
        builder.append("메디컬재발횟수 <= (5 - 메디컬통원치료) ");
        builder.append(" && ");
        builder.append("메디컬통원치료 <= 7 ");
        builder.append(" && ");
        builder.append("메디컬합병증여부 == \"0\" ");
        builder.append(" && ");
        builder.append("치료방법문자열.indexOf(\"수술치료\") > 0");
        builder.append(" && ");
        builder.append("( 추가질문지답변문자열4.indexOf(\"상해\") > 0 || 추가질문지답변문자열4.indexOf(\"치아우식증\") > 0 )");
        builder.append(" && ");
        builder.append("추가질문답변숫자형1 <= 14 ");

        long start = System.currentTimeMillis();

        for(int i=0 ;i<10000; i++) {
            Object obj = MVEL.eval(builder.toString(), map);

//            if(i % 2000 == 0) {
//                log.error("JVM total:{}, usage:{}", Runtime.getRuntime().totalMemory(), Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
//            }
        }

        log.debug("duration:{}", System.currentTimeMillis() - start);

        log.error("JVM total:{}, usage:{}", Runtime.getRuntime().totalMemory(), Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());


    }


}
