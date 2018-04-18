package com.morningtec.sheldonrabbit.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author sheldon
*/
public class User implements Serializable {

    private static final long serialVersionUID = 1523963301166L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 
    * isNullAble:0
    */
    private String deviceId;

    /**
    * 1:android 2:ios
    * isNullAble:0,defaultVal:1
    */
    private Integer os;

    /**
    * 0:deleted 1:in use
    * isNullAble:0,defaultVal:1
    */
    private Integer flag;

    /**
    * 
    * isNullAble:1
    */
    private String migratePass;

    /**
    * 
    * isNullAble:0
    */
    private String userId;

    /**
    * 
    * isNullAble:1
    */
    private String createTime;


    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public void setDeviceId(String deviceId){
        this.deviceId = deviceId;
    }

    public String getDeviceId(){
        return this.deviceId;
    }

    public void setOs(Integer os){
        this.os = os;
    }

    public Integer getOs(){
        return this.os;
    }

    public void setFlag(Integer flag){
        this.flag = flag;
    }

    public Integer getFlag(){
        return this.flag;
    }

    public void setMigratePass(String migratePass){
        this.migratePass = migratePass;
    }

    public String getMigratePass(){
        return this.migratePass;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }

    public String getUserId(){
        return this.userId;
    }

    public void setCreateTime(String createTime){
        this.createTime = createTime;
    }

    public String getCreateTime(){
        return this.createTime;
    }
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                "deviceId='" + deviceId + '\'' +
                "os='" + os + '\'' +
                "flag='" + flag + '\'' +
                "migratePass='" + migratePass + '\'' +
                "userId='" + userId + '\'' +
                "createTime='" + createTime + '\'' +
            '}';
    }

    public User(Long id, String deviceId, Integer os, Integer flag, String migratePass, String userId, String createTime) {
        this.id = id;
        this.deviceId = deviceId;
        this.os = os;
        this.flag = flag;
        this.migratePass = migratePass;
        this.userId = userId;
        this.createTime = createTime;
    }

    public User() {
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends User{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
        }

        private List<Long> idList;

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){
            return this.idSt;
        }

        public Long getIdEd(){
            return this.idEd;
        }

        private List<String> deviceIdList;


        private List<String> fuzzyDeviceId;

        public List<String> getFuzzyDeviceId(){
            return this.fuzzyDeviceId;
        }

        private List<String> rightFuzzyDeviceId;

        public List<String> getRightFuzzyDeviceId(){
            return this.rightFuzzyDeviceId;
        }
        private List<Integer> osList;

        private Integer osSt;

        private Integer osEd;

        public Integer getOsSt(){
            return this.osSt;
        }

        public Integer getOsEd(){
            return this.osEd;
        }

        private List<Integer> flagList;

        private Integer flagSt;

        private Integer flagEd;

        public Integer getFlagSt(){
            return this.flagSt;
        }

        public Integer getFlagEd(){
            return this.flagEd;
        }

        private List<String> migratePassList;


        private List<String> fuzzyMigratePass;

        public List<String> getFuzzyMigratePass(){
            return this.fuzzyMigratePass;
        }

        private List<String> rightFuzzyMigratePass;

        public List<String> getRightFuzzyMigratePass(){
            return this.rightFuzzyMigratePass;
        }
        private List<String> userIdList;


        private List<String> fuzzyUserId;

        public List<String> getFuzzyUserId(){
            return this.fuzzyUserId;
        }

        private List<String> rightFuzzyUserId;

        public List<String> getRightFuzzyUserId(){
            return this.rightFuzzyUserId;
        }
        private List<String> createTimeList;


        private List<String> fuzzyCreateTime;

        public List<String> getFuzzyCreateTime(){
            return this.fuzzyCreateTime;
        }

        private List<String> rightFuzzyCreateTime;

        public List<String> getRightFuzzyCreateTime(){
            return this.rightFuzzyCreateTime;
        }
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }


        public QueryBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Long id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Long ... id){
            if (id != null){
                List<Long> list = new ArrayList<>();
                for (Long item : id){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.idList = list;
            }

            return this;
        }

        public QueryBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }



        public QueryBuilder fuzzyDeviceId (List<String> fuzzyDeviceId){
            this.fuzzyDeviceId = fuzzyDeviceId;
            return this;
        }

        public QueryBuilder fuzzyDeviceId (String ... fuzzyDeviceId){
            if (fuzzyDeviceId != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyDeviceId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyDeviceId = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyDeviceId (List<String> rightFuzzyDeviceId){
            this.rightFuzzyDeviceId = rightFuzzyDeviceId;
            return this;
        }

        public QueryBuilder rightFuzzyDeviceId (String ... rightFuzzyDeviceId){
            if (rightFuzzyDeviceId != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyDeviceId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyDeviceId = list;
            }
            return this;
        }

        public QueryBuilder deviceId(String deviceId){
            setDeviceId(deviceId);
            return this;
        }

        public QueryBuilder deviceIdList(String ... deviceId){
            if (deviceId != null){
                List<String> list = new ArrayList<>();
                for (String item : deviceId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.deviceIdList = list;
            }

            return this;
        }

        public QueryBuilder deviceIdList(List<String> deviceId){
            this.deviceIdList = deviceId;
            return this;
        }

        public QueryBuilder fetchDeviceId(){
            setFetchFields("fetchFields","deviceId");
            return this;
        }

        public QueryBuilder excludeDeviceId(){
            setFetchFields("excludeFields","deviceId");
            return this;
        }



        public QueryBuilder osBetWeen(Integer osSt,Integer osEd){
            this.osSt = osSt;
            this.osEd = osEd;
            return this;
        }

        public QueryBuilder osGreaterEqThan(Integer osSt){
            this.osSt = osSt;
            return this;
        }
        public QueryBuilder osLessEqThan(Integer osEd){
            this.osEd = osEd;
            return this;
        }


        public QueryBuilder os(Integer os){
            setOs(os);
            return this;
        }

        public QueryBuilder osList(Integer ... os){
            if (os != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : os){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.osList = list;
            }

            return this;
        }

        public QueryBuilder osList(List<Integer> os){
            this.osList = os;
            return this;
        }

        public QueryBuilder fetchOs(){
            setFetchFields("fetchFields","os");
            return this;
        }

        public QueryBuilder excludeOs(){
            setFetchFields("excludeFields","os");
            return this;
        }



        public QueryBuilder flagBetWeen(Integer flagSt,Integer flagEd){
            this.flagSt = flagSt;
            this.flagEd = flagEd;
            return this;
        }

        public QueryBuilder flagGreaterEqThan(Integer flagSt){
            this.flagSt = flagSt;
            return this;
        }
        public QueryBuilder flagLessEqThan(Integer flagEd){
            this.flagEd = flagEd;
            return this;
        }


        public QueryBuilder flag(Integer flag){
            setFlag(flag);
            return this;
        }

        public QueryBuilder flagList(Integer ... flag){
            if (flag != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : flag){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.flagList = list;
            }

            return this;
        }

        public QueryBuilder flagList(List<Integer> flag){
            this.flagList = flag;
            return this;
        }

        public QueryBuilder fetchFlag(){
            setFetchFields("fetchFields","flag");
            return this;
        }

        public QueryBuilder excludeFlag(){
            setFetchFields("excludeFields","flag");
            return this;
        }



        public QueryBuilder fuzzyMigratePass (List<String> fuzzyMigratePass){
            this.fuzzyMigratePass = fuzzyMigratePass;
            return this;
        }

        public QueryBuilder fuzzyMigratePass (String ... fuzzyMigratePass){
            if (fuzzyMigratePass != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyMigratePass){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyMigratePass = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyMigratePass (List<String> rightFuzzyMigratePass){
            this.rightFuzzyMigratePass = rightFuzzyMigratePass;
            return this;
        }

        public QueryBuilder rightFuzzyMigratePass (String ... rightFuzzyMigratePass){
            if (rightFuzzyMigratePass != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyMigratePass){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyMigratePass = list;
            }
            return this;
        }

        public QueryBuilder migratePass(String migratePass){
            setMigratePass(migratePass);
            return this;
        }

        public QueryBuilder migratePassList(String ... migratePass){
            if (migratePass != null){
                List<String> list = new ArrayList<>();
                for (String item : migratePass){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.migratePassList = list;
            }

            return this;
        }

        public QueryBuilder migratePassList(List<String> migratePass){
            this.migratePassList = migratePass;
            return this;
        }

        public QueryBuilder fetchMigratePass(){
            setFetchFields("fetchFields","migratePass");
            return this;
        }

        public QueryBuilder excludeMigratePass(){
            setFetchFields("excludeFields","migratePass");
            return this;
        }



        public QueryBuilder fuzzyUserId (List<String> fuzzyUserId){
            this.fuzzyUserId = fuzzyUserId;
            return this;
        }

        public QueryBuilder fuzzyUserId (String ... fuzzyUserId){
            if (fuzzyUserId != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyUserId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyUserId = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyUserId (List<String> rightFuzzyUserId){
            this.rightFuzzyUserId = rightFuzzyUserId;
            return this;
        }

        public QueryBuilder rightFuzzyUserId (String ... rightFuzzyUserId){
            if (rightFuzzyUserId != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyUserId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyUserId = list;
            }
            return this;
        }

        public QueryBuilder userId(String userId){
            setUserId(userId);
            return this;
        }

        public QueryBuilder userIdList(String ... userId){
            if (userId != null){
                List<String> list = new ArrayList<>();
                for (String item : userId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.userIdList = list;
            }

            return this;
        }

        public QueryBuilder userIdList(List<String> userId){
            this.userIdList = userId;
            return this;
        }

        public QueryBuilder fetchUserId(){
            setFetchFields("fetchFields","userId");
            return this;
        }

        public QueryBuilder excludeUserId(){
            setFetchFields("excludeFields","userId");
            return this;
        }



        public QueryBuilder fuzzyCreateTime (List<String> fuzzyCreateTime){
            this.fuzzyCreateTime = fuzzyCreateTime;
            return this;
        }

        public QueryBuilder fuzzyCreateTime (String ... fuzzyCreateTime){
            if (fuzzyCreateTime != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyCreateTime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyCreateTime = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyCreateTime (List<String> rightFuzzyCreateTime){
            this.rightFuzzyCreateTime = rightFuzzyCreateTime;
            return this;
        }

        public QueryBuilder rightFuzzyCreateTime (String ... rightFuzzyCreateTime){
            if (rightFuzzyCreateTime != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyCreateTime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyCreateTime = list;
            }
            return this;
        }

        public QueryBuilder createTime(String createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(String ... createTime){
            if (createTime != null){
                List<String> list = new ArrayList<>();
                for (String item : createTime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.createTimeList = list;
            }

            return this;
        }

        public QueryBuilder createTimeList(List<String> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime(){
            setFetchFields("fetchFields","createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime(){
            setFetchFields("excludeFields","createTime");
            return this;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public User build(){
            return this;
        }
    }

}
