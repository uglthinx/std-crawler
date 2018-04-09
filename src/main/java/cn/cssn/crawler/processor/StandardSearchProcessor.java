package cn.cssn.crawler.processor;

import cn.cssn.crawler.entity.Standard;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class StandardSearchProcessor {
    private static String BASE_URL = "http://www.std.gov.cn/gb/search/gbAdvancedSearchPage";
    private int tid;
    private Date startDate;
    private Date endDate;
    private int size;

    public StandardSearchProcessor(int tid, Date startDate, Date endDate, int size) {
        this.tid = tid;
        this.startDate = startDate;
        this.endDate = endDate;
        this.size = size;
    }

    public Pair<List<Standard>, Boolean> download(int page) {
        String url = String.format("%s?tid=%d&sortOrder=asc&pageSize=%d&pageNumber=%d", BASE_URL, tid, size, page);
        if (startDate != null) {
            url += new SimpleDateFormat("&std_p10=YYYY-MM-DD").format(startDate);
        }
        if (endDate != null) {
            url += new SimpleDateFormat("&std_p11=YYYY-MM-DD").format(endDate);
        }
        System.out.println("Downloading " + url + " ...");

        RestTemplate restTemplate = new RestTemplateBuilder().build();
        String responseStr = restTemplate.getForObject(url, String.class);

        System.out.println(responseStr);
        JSONObject jsonObject = JSON.parseObject(responseStr);
        for (String key : jsonObject.keySet()) {
            System.out.println(key);
        }
        int totalNumber = jsonObject.getIntValue("total");
        JSONArray rows = jsonObject.getJSONArray("rows");
        for (Object row : rows) {
            Standard standard = new Standard();
            JSONObject standardJson = (JSONObject) row;
            List<String> keys = standardJson.keySet().stream().sorted().collect(Collectors.toList());
            for (String key : keys) {
                System.out.println(key + " : " + standardJson.get(key));
            }
            standard.setActDate(standardJson.getDate("ACT_DATE"));
            standard.setAdoptCName(standardJson.getString("ADOPT_C_NAME"));
            standard.setAdoptLevel(standardJson.getString("ADOPT_LEVEL"));
            standard.setAdoptNo(standardJson.getString("ADOPT_NO"));
            standard.setAdoptType(standardJson.getString("ADOPT_TYPE"));
            standard.setCcs(standardJson.getString("CCS"));
            standard.setCdCode(standardJson.getString("CD_CODE"));
            standard.setCdName(standardJson.getString("CD_NAME"));
            standard.setcName(standardJson.getString("C_NAME"));
            standard.setDraftStaff(standardJson.getString("DRAFT_STAFF"));
            standard.setDraftStaff(standardJson.getString("DRAFT_UNIT"));
            standard.seteName(standardJson.getString("E_NAME"));
            standard.setHasGbf(standardJson.getString("HAS_GBF"));
            standard.setIcs(standardJson.getString("ICS"));
            standard.setIcsName11(standardJson.getString("ICS_NAME1_1"));
            standard.setIcsName1Full(standardJson.getString("ICS_NAME1_FULL"));
            standard.setIssueAnnNo(standardJson.getString("ISSUE_ANN_NO"));
            standard.setIssueDate(standardJson.getDate("ISSUE_DATE"));
            standard.setPlanCode(standardJson.getString("PLAN_CODE"));
            standard.setProjectId(standardJson.getLong("PROJECT_ID"));
            standard.setSortWeight(standardJson.getLong("SORT_WEIGHT"));
            standard.setState(standardJson.getString("STATE"));
            standard.setStdCode(standardJson.getString("STD_CODE"));
            standard.setStdCode2(standardJson.getString("STD_CODE2"));
            standard.setStdCode3(standardJson.getString("STD_CODE3"));
            standard.setStdCode4(standardJson.getString("STD_CODE4"));
            standard.setStdCode5(standardJson.getString("STD_CODE5"));
            standard.setStdDomains(standardJson.getString("STD_DOMAIN"));
            standard.setStdNature(standardJson.getString("STD_NATURE"));
            standard.setStdType(standardJson.getString("STD_TYPE"));
            standard.setSysInputTime(standardJson.getDate("SYS_INPUTIME"));
            standard.setTableName(standardJson.getString("TABLE_NAME"));
            standard.setTaCode(standardJson.getString("TA_CODE"));
            standard.setTaName(standardJson.getString("TA_NAME"));
            standard.setTmCode(standardJson.getString("TM_CODE"));
            standard.setTmName(standardJson.getString("TM_NAME"));
            standard.setTotalRepe(standardJson.getString("TOTAL_REPE"));
            standard.setId(standardJson.getString("id"));
            System.out.println(standard);
        }
        return null;
    }

    public static void main(String[] args) {
        new StandardSearchProcessor(2, null, null, 10).download(1);
    }
}
