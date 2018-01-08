package com.demo.dao.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VehicleGpsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VehicleGpsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andGpstimeIsNull() {
            addCriterion("GPSTIME is null");
            return (Criteria) this;
        }

        public Criteria andGpstimeIsNotNull() {
            addCriterion("GPSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andGpstimeEqualTo(String value) {
            addCriterion("GPSTIME =", value, "gpstime");
            return (Criteria) this;
        }

        public Criteria andGpstimeNotEqualTo(String value) {
            addCriterion("GPSTIME <>", value, "gpstime");
            return (Criteria) this;
        }

        public Criteria andGpstimeGreaterThan(String value) {
            addCriterion("GPSTIME >", value, "gpstime");
            return (Criteria) this;
        }

        public Criteria andGpstimeGreaterThanOrEqualTo(String value) {
            addCriterion("GPSTIME >=", value, "gpstime");
            return (Criteria) this;
        }

        public Criteria andGpstimeLessThan(String value) {
            addCriterion("GPSTIME <", value, "gpstime");
            return (Criteria) this;
        }

        public Criteria andGpstimeLessThanOrEqualTo(String value) {
            addCriterion("GPSTIME <=", value, "gpstime");
            return (Criteria) this;
        }

        public Criteria andGpstimeLike(String value) {
            addCriterion("GPSTIME like", value, "gpstime");
            return (Criteria) this;
        }

        public Criteria andGpstimeNotLike(String value) {
            addCriterion("GPSTIME not like", value, "gpstime");
            return (Criteria) this;
        }

        public Criteria andGpstimeIn(List<String> values) {
            addCriterion("GPSTIME in", values, "gpstime");
            return (Criteria) this;
        }

        public Criteria andGpstimeNotIn(List<String> values) {
            addCriterion("GPSTIME not in", values, "gpstime");
            return (Criteria) this;
        }

        public Criteria andGpstimeBetween(String value1, String value2) {
            addCriterion("GPSTIME between", value1, value2, "gpstime");
            return (Criteria) this;
        }

        public Criteria andGpstimeNotBetween(String value1, String value2) {
            addCriterion("GPSTIME not between", value1, value2, "gpstime");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("LNG is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("LNG is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(BigDecimal value) {
            addCriterion("LNG =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(BigDecimal value) {
            addCriterion("LNG <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(BigDecimal value) {
            addCriterion("LNG >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LNG >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(BigDecimal value) {
            addCriterion("LNG <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LNG <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<BigDecimal> values) {
            addCriterion("LNG in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<BigDecimal> values) {
            addCriterion("LNG not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LNG between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LNG not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("LAT is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("LAT is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(BigDecimal value) {
            addCriterion("LAT =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(BigDecimal value) {
            addCriterion("LAT <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(BigDecimal value) {
            addCriterion("LAT >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LAT >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(BigDecimal value) {
            addCriterion("LAT <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LAT <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<BigDecimal> values) {
            addCriterion("LAT in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<BigDecimal> values) {
            addCriterion("LAT not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAT between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAT not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andAvIsNull() {
            addCriterion("AV is null");
            return (Criteria) this;
        }

        public Criteria andAvIsNotNull() {
            addCriterion("AV is not null");
            return (Criteria) this;
        }

        public Criteria andAvEqualTo(Short value) {
            addCriterion("AV =", value, "av");
            return (Criteria) this;
        }

        public Criteria andAvNotEqualTo(Short value) {
            addCriterion("AV <>", value, "av");
            return (Criteria) this;
        }

        public Criteria andAvGreaterThan(Short value) {
            addCriterion("AV >", value, "av");
            return (Criteria) this;
        }

        public Criteria andAvGreaterThanOrEqualTo(Short value) {
            addCriterion("AV >=", value, "av");
            return (Criteria) this;
        }

        public Criteria andAvLessThan(Short value) {
            addCriterion("AV <", value, "av");
            return (Criteria) this;
        }

        public Criteria andAvLessThanOrEqualTo(Short value) {
            addCriterion("AV <=", value, "av");
            return (Criteria) this;
        }

        public Criteria andAvIn(List<Short> values) {
            addCriterion("AV in", values, "av");
            return (Criteria) this;
        }

        public Criteria andAvNotIn(List<Short> values) {
            addCriterion("AV not in", values, "av");
            return (Criteria) this;
        }

        public Criteria andAvBetween(Short value1, Short value2) {
            addCriterion("AV between", value1, value2, "av");
            return (Criteria) this;
        }

        public Criteria andAvNotBetween(Short value1, Short value2) {
            addCriterion("AV not between", value1, value2, "av");
            return (Criteria) this;
        }

        public Criteria andVeoIsNull() {
            addCriterion("VEO is null");
            return (Criteria) this;
        }

        public Criteria andVeoIsNotNull() {
            addCriterion("VEO is not null");
            return (Criteria) this;
        }

        public Criteria andVeoEqualTo(BigDecimal value) {
            addCriterion("VEO =", value, "veo");
            return (Criteria) this;
        }

        public Criteria andVeoNotEqualTo(BigDecimal value) {
            addCriterion("VEO <>", value, "veo");
            return (Criteria) this;
        }

        public Criteria andVeoGreaterThan(BigDecimal value) {
            addCriterion("VEO >", value, "veo");
            return (Criteria) this;
        }

        public Criteria andVeoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VEO >=", value, "veo");
            return (Criteria) this;
        }

        public Criteria andVeoLessThan(BigDecimal value) {
            addCriterion("VEO <", value, "veo");
            return (Criteria) this;
        }

        public Criteria andVeoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VEO <=", value, "veo");
            return (Criteria) this;
        }

        public Criteria andVeoIn(List<BigDecimal> values) {
            addCriterion("VEO in", values, "veo");
            return (Criteria) this;
        }

        public Criteria andVeoNotIn(List<BigDecimal> values) {
            addCriterion("VEO not in", values, "veo");
            return (Criteria) this;
        }

        public Criteria andVeoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VEO between", value1, value2, "veo");
            return (Criteria) this;
        }

        public Criteria andVeoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VEO not between", value1, value2, "veo");
            return (Criteria) this;
        }

        public Criteria andDirIsNull() {
            addCriterion("DIR is null");
            return (Criteria) this;
        }

        public Criteria andDirIsNotNull() {
            addCriterion("DIR is not null");
            return (Criteria) this;
        }

        public Criteria andDirEqualTo(String value) {
            addCriterion("DIR =", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirNotEqualTo(String value) {
            addCriterion("DIR <>", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirGreaterThan(String value) {
            addCriterion("DIR >", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirGreaterThanOrEqualTo(String value) {
            addCriterion("DIR >=", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirLessThan(String value) {
            addCriterion("DIR <", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirLessThanOrEqualTo(String value) {
            addCriterion("DIR <=", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirLike(String value) {
            addCriterion("DIR like", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirNotLike(String value) {
            addCriterion("DIR not like", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirIn(List<String> values) {
            addCriterion("DIR in", values, "dir");
            return (Criteria) this;
        }

        public Criteria andDirNotIn(List<String> values) {
            addCriterion("DIR not in", values, "dir");
            return (Criteria) this;
        }

        public Criteria andDirBetween(String value1, String value2) {
            addCriterion("DIR between", value1, value2, "dir");
            return (Criteria) this;
        }

        public Criteria andDirNotBetween(String value1, String value2) {
            addCriterion("DIR not between", value1, value2, "dir");
            return (Criteria) this;
        }

        public Criteria andDisIsNull() {
            addCriterion("DIS is null");
            return (Criteria) this;
        }

        public Criteria andDisIsNotNull() {
            addCriterion("DIS is not null");
            return (Criteria) this;
        }

        public Criteria andDisEqualTo(BigDecimal value) {
            addCriterion("DIS =", value, "dis");
            return (Criteria) this;
        }

        public Criteria andDisNotEqualTo(BigDecimal value) {
            addCriterion("DIS <>", value, "dis");
            return (Criteria) this;
        }

        public Criteria andDisGreaterThan(BigDecimal value) {
            addCriterion("DIS >", value, "dis");
            return (Criteria) this;
        }

        public Criteria andDisGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DIS >=", value, "dis");
            return (Criteria) this;
        }

        public Criteria andDisLessThan(BigDecimal value) {
            addCriterion("DIS <", value, "dis");
            return (Criteria) this;
        }

        public Criteria andDisLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DIS <=", value, "dis");
            return (Criteria) this;
        }

        public Criteria andDisIn(List<BigDecimal> values) {
            addCriterion("DIS in", values, "dis");
            return (Criteria) this;
        }

        public Criteria andDisNotIn(List<BigDecimal> values) {
            addCriterion("DIS not in", values, "dis");
            return (Criteria) this;
        }

        public Criteria andDisBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DIS between", value1, value2, "dis");
            return (Criteria) this;
        }

        public Criteria andDisNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DIS not between", value1, value2, "dis");
            return (Criteria) this;
        }

        public Criteria andOffsetlngIsNull() {
            addCriterion("OFFSETLNG is null");
            return (Criteria) this;
        }

        public Criteria andOffsetlngIsNotNull() {
            addCriterion("OFFSETLNG is not null");
            return (Criteria) this;
        }

        public Criteria andOffsetlngEqualTo(BigDecimal value) {
            addCriterion("OFFSETLNG =", value, "offsetlng");
            return (Criteria) this;
        }

        public Criteria andOffsetlngNotEqualTo(BigDecimal value) {
            addCriterion("OFFSETLNG <>", value, "offsetlng");
            return (Criteria) this;
        }

        public Criteria andOffsetlngGreaterThan(BigDecimal value) {
            addCriterion("OFFSETLNG >", value, "offsetlng");
            return (Criteria) this;
        }

        public Criteria andOffsetlngGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OFFSETLNG >=", value, "offsetlng");
            return (Criteria) this;
        }

        public Criteria andOffsetlngLessThan(BigDecimal value) {
            addCriterion("OFFSETLNG <", value, "offsetlng");
            return (Criteria) this;
        }

        public Criteria andOffsetlngLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OFFSETLNG <=", value, "offsetlng");
            return (Criteria) this;
        }

        public Criteria andOffsetlngIn(List<BigDecimal> values) {
            addCriterion("OFFSETLNG in", values, "offsetlng");
            return (Criteria) this;
        }

        public Criteria andOffsetlngNotIn(List<BigDecimal> values) {
            addCriterion("OFFSETLNG not in", values, "offsetlng");
            return (Criteria) this;
        }

        public Criteria andOffsetlngBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OFFSETLNG between", value1, value2, "offsetlng");
            return (Criteria) this;
        }

        public Criteria andOffsetlngNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OFFSETLNG not between", value1, value2, "offsetlng");
            return (Criteria) this;
        }

        public Criteria andOffsetlatIsNull() {
            addCriterion("OFFSETLAT is null");
            return (Criteria) this;
        }

        public Criteria andOffsetlatIsNotNull() {
            addCriterion("OFFSETLAT is not null");
            return (Criteria) this;
        }

        public Criteria andOffsetlatEqualTo(BigDecimal value) {
            addCriterion("OFFSETLAT =", value, "offsetlat");
            return (Criteria) this;
        }

        public Criteria andOffsetlatNotEqualTo(BigDecimal value) {
            addCriterion("OFFSETLAT <>", value, "offsetlat");
            return (Criteria) this;
        }

        public Criteria andOffsetlatGreaterThan(BigDecimal value) {
            addCriterion("OFFSETLAT >", value, "offsetlat");
            return (Criteria) this;
        }

        public Criteria andOffsetlatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OFFSETLAT >=", value, "offsetlat");
            return (Criteria) this;
        }

        public Criteria andOffsetlatLessThan(BigDecimal value) {
            addCriterion("OFFSETLAT <", value, "offsetlat");
            return (Criteria) this;
        }

        public Criteria andOffsetlatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OFFSETLAT <=", value, "offsetlat");
            return (Criteria) this;
        }

        public Criteria andOffsetlatIn(List<BigDecimal> values) {
            addCriterion("OFFSETLAT in", values, "offsetlat");
            return (Criteria) this;
        }

        public Criteria andOffsetlatNotIn(List<BigDecimal> values) {
            addCriterion("OFFSETLAT not in", values, "offsetlat");
            return (Criteria) this;
        }

        public Criteria andOffsetlatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OFFSETLAT between", value1, value2, "offsetlat");
            return (Criteria) this;
        }

        public Criteria andOffsetlatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OFFSETLAT not between", value1, value2, "offsetlat");
            return (Criteria) this;
        }

        public Criteria andMol0IsNull() {
            addCriterion("MOL0 is null");
            return (Criteria) this;
        }

        public Criteria andMol0IsNotNull() {
            addCriterion("MOL0 is not null");
            return (Criteria) this;
        }

        public Criteria andMol0EqualTo(BigDecimal value) {
            addCriterion("MOL0 =", value, "mol0");
            return (Criteria) this;
        }

        public Criteria andMol0NotEqualTo(BigDecimal value) {
            addCriterion("MOL0 <>", value, "mol0");
            return (Criteria) this;
        }

        public Criteria andMol0GreaterThan(BigDecimal value) {
            addCriterion("MOL0 >", value, "mol0");
            return (Criteria) this;
        }

        public Criteria andMol0GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOL0 >=", value, "mol0");
            return (Criteria) this;
        }

        public Criteria andMol0LessThan(BigDecimal value) {
            addCriterion("MOL0 <", value, "mol0");
            return (Criteria) this;
        }

        public Criteria andMol0LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOL0 <=", value, "mol0");
            return (Criteria) this;
        }

        public Criteria andMol0In(List<BigDecimal> values) {
            addCriterion("MOL0 in", values, "mol0");
            return (Criteria) this;
        }

        public Criteria andMol0NotIn(List<BigDecimal> values) {
            addCriterion("MOL0 not in", values, "mol0");
            return (Criteria) this;
        }

        public Criteria andMol0Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOL0 between", value1, value2, "mol0");
            return (Criteria) this;
        }

        public Criteria andMol0NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOL0 not between", value1, value2, "mol0");
            return (Criteria) this;
        }

        public Criteria andMol1IsNull() {
            addCriterion("MOL1 is null");
            return (Criteria) this;
        }

        public Criteria andMol1IsNotNull() {
            addCriterion("MOL1 is not null");
            return (Criteria) this;
        }

        public Criteria andMol1EqualTo(BigDecimal value) {
            addCriterion("MOL1 =", value, "mol1");
            return (Criteria) this;
        }

        public Criteria andMol1NotEqualTo(BigDecimal value) {
            addCriterion("MOL1 <>", value, "mol1");
            return (Criteria) this;
        }

        public Criteria andMol1GreaterThan(BigDecimal value) {
            addCriterion("MOL1 >", value, "mol1");
            return (Criteria) this;
        }

        public Criteria andMol1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOL1 >=", value, "mol1");
            return (Criteria) this;
        }

        public Criteria andMol1LessThan(BigDecimal value) {
            addCriterion("MOL1 <", value, "mol1");
            return (Criteria) this;
        }

        public Criteria andMol1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOL1 <=", value, "mol1");
            return (Criteria) this;
        }

        public Criteria andMol1In(List<BigDecimal> values) {
            addCriterion("MOL1 in", values, "mol1");
            return (Criteria) this;
        }

        public Criteria andMol1NotIn(List<BigDecimal> values) {
            addCriterion("MOL1 not in", values, "mol1");
            return (Criteria) this;
        }

        public Criteria andMol1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOL1 between", value1, value2, "mol1");
            return (Criteria) this;
        }

        public Criteria andMol1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOL1 not between", value1, value2, "mol1");
            return (Criteria) this;
        }

        public Criteria andXhqdIsNull() {
            addCriterion("XHQD is null");
            return (Criteria) this;
        }

        public Criteria andXhqdIsNotNull() {
            addCriterion("XHQD is not null");
            return (Criteria) this;
        }

        public Criteria andXhqdEqualTo(BigDecimal value) {
            addCriterion("XHQD =", value, "xhqd");
            return (Criteria) this;
        }

        public Criteria andXhqdNotEqualTo(BigDecimal value) {
            addCriterion("XHQD <>", value, "xhqd");
            return (Criteria) this;
        }

        public Criteria andXhqdGreaterThan(BigDecimal value) {
            addCriterion("XHQD >", value, "xhqd");
            return (Criteria) this;
        }

        public Criteria andXhqdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XHQD >=", value, "xhqd");
            return (Criteria) this;
        }

        public Criteria andXhqdLessThan(BigDecimal value) {
            addCriterion("XHQD <", value, "xhqd");
            return (Criteria) this;
        }

        public Criteria andXhqdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XHQD <=", value, "xhqd");
            return (Criteria) this;
        }

        public Criteria andXhqdIn(List<BigDecimal> values) {
            addCriterion("XHQD in", values, "xhqd");
            return (Criteria) this;
        }

        public Criteria andXhqdNotIn(List<BigDecimal> values) {
            addCriterion("XHQD not in", values, "xhqd");
            return (Criteria) this;
        }

        public Criteria andXhqdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XHQD between", value1, value2, "xhqd");
            return (Criteria) this;
        }

        public Criteria andXhqdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XHQD not between", value1, value2, "xhqd");
            return (Criteria) this;
        }

        public Criteria andWxgsIsNull() {
            addCriterion("WXGS is null");
            return (Criteria) this;
        }

        public Criteria andWxgsIsNotNull() {
            addCriterion("WXGS is not null");
            return (Criteria) this;
        }

        public Criteria andWxgsEqualTo(Short value) {
            addCriterion("WXGS =", value, "wxgs");
            return (Criteria) this;
        }

        public Criteria andWxgsNotEqualTo(Short value) {
            addCriterion("WXGS <>", value, "wxgs");
            return (Criteria) this;
        }

        public Criteria andWxgsGreaterThan(Short value) {
            addCriterion("WXGS >", value, "wxgs");
            return (Criteria) this;
        }

        public Criteria andWxgsGreaterThanOrEqualTo(Short value) {
            addCriterion("WXGS >=", value, "wxgs");
            return (Criteria) this;
        }

        public Criteria andWxgsLessThan(Short value) {
            addCriterion("WXGS <", value, "wxgs");
            return (Criteria) this;
        }

        public Criteria andWxgsLessThanOrEqualTo(Short value) {
            addCriterion("WXGS <=", value, "wxgs");
            return (Criteria) this;
        }

        public Criteria andWxgsIn(List<Short> values) {
            addCriterion("WXGS in", values, "wxgs");
            return (Criteria) this;
        }

        public Criteria andWxgsNotIn(List<Short> values) {
            addCriterion("WXGS not in", values, "wxgs");
            return (Criteria) this;
        }

        public Criteria andWxgsBetween(Short value1, Short value2) {
            addCriterion("WXGS between", value1, value2, "wxgs");
            return (Criteria) this;
        }

        public Criteria andWxgsNotBetween(Short value1, Short value2) {
            addCriterion("WXGS not between", value1, value2, "wxgs");
            return (Criteria) this;
        }

        public Criteria andSimIsNull() {
            addCriterion("SIM is null");
            return (Criteria) this;
        }

        public Criteria andSimIsNotNull() {
            addCriterion("SIM is not null");
            return (Criteria) this;
        }

        public Criteria andSimEqualTo(String value) {
            addCriterion("SIM =", value, "sim");
            return (Criteria) this;
        }

        public Criteria andSimNotEqualTo(String value) {
            addCriterion("SIM <>", value, "sim");
            return (Criteria) this;
        }

        public Criteria andSimGreaterThan(String value) {
            addCriterion("SIM >", value, "sim");
            return (Criteria) this;
        }

        public Criteria andSimGreaterThanOrEqualTo(String value) {
            addCriterion("SIM >=", value, "sim");
            return (Criteria) this;
        }

        public Criteria andSimLessThan(String value) {
            addCriterion("SIM <", value, "sim");
            return (Criteria) this;
        }

        public Criteria andSimLessThanOrEqualTo(String value) {
            addCriterion("SIM <=", value, "sim");
            return (Criteria) this;
        }

        public Criteria andSimLike(String value) {
            addCriterion("SIM like", value, "sim");
            return (Criteria) this;
        }

        public Criteria andSimNotLike(String value) {
            addCriterion("SIM not like", value, "sim");
            return (Criteria) this;
        }

        public Criteria andSimIn(List<String> values) {
            addCriterion("SIM in", values, "sim");
            return (Criteria) this;
        }

        public Criteria andSimNotIn(List<String> values) {
            addCriterion("SIM not in", values, "sim");
            return (Criteria) this;
        }

        public Criteria andSimBetween(String value1, String value2) {
            addCriterion("SIM between", value1, value2, "sim");
            return (Criteria) this;
        }

        public Criteria andSimNotBetween(String value1, String value2) {
            addCriterion("SIM not between", value1, value2, "sim");
            return (Criteria) this;
        }

        public Criteria andStatIsNull() {
            addCriterion("STAT is null");
            return (Criteria) this;
        }

        public Criteria andStatIsNotNull() {
            addCriterion("STAT is not null");
            return (Criteria) this;
        }

        public Criteria andStatEqualTo(String value) {
            addCriterion("STAT =", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatNotEqualTo(String value) {
            addCriterion("STAT <>", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatGreaterThan(String value) {
            addCriterion("STAT >", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatGreaterThanOrEqualTo(String value) {
            addCriterion("STAT >=", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatLessThan(String value) {
            addCriterion("STAT <", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatLessThanOrEqualTo(String value) {
            addCriterion("STAT <=", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatLike(String value) {
            addCriterion("STAT like", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatNotLike(String value) {
            addCriterion("STAT not like", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatIn(List<String> values) {
            addCriterion("STAT in", values, "stat");
            return (Criteria) this;
        }

        public Criteria andStatNotIn(List<String> values) {
            addCriterion("STAT not in", values, "stat");
            return (Criteria) this;
        }

        public Criteria andStatBetween(String value1, String value2) {
            addCriterion("STAT between", value1, value2, "stat");
            return (Criteria) this;
        }

        public Criteria andStatNotBetween(String value1, String value2) {
            addCriterion("STAT not between", value1, value2, "stat");
            return (Criteria) this;
        }

        public Criteria andAlarmIsNull() {
            addCriterion("ALARM is null");
            return (Criteria) this;
        }

        public Criteria andAlarmIsNotNull() {
            addCriterion("ALARM is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmEqualTo(String value) {
            addCriterion("ALARM =", value, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmNotEqualTo(String value) {
            addCriterion("ALARM <>", value, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmGreaterThan(String value) {
            addCriterion("ALARM >", value, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmGreaterThanOrEqualTo(String value) {
            addCriterion("ALARM >=", value, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmLessThan(String value) {
            addCriterion("ALARM <", value, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmLessThanOrEqualTo(String value) {
            addCriterion("ALARM <=", value, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmLike(String value) {
            addCriterion("ALARM like", value, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmNotLike(String value) {
            addCriterion("ALARM not like", value, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmIn(List<String> values) {
            addCriterion("ALARM in", values, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmNotIn(List<String> values) {
            addCriterion("ALARM not in", values, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmBetween(String value1, String value2) {
            addCriterion("ALARM between", value1, value2, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmNotBetween(String value1, String value2) {
            addCriterion("ALARM not between", value1, value2, "alarm");
            return (Criteria) this;
        }

        public Criteria andOilIsNull() {
            addCriterion("OIL is null");
            return (Criteria) this;
        }

        public Criteria andOilIsNotNull() {
            addCriterion("OIL is not null");
            return (Criteria) this;
        }

        public Criteria andOilEqualTo(String value) {
            addCriterion("OIL =", value, "oil");
            return (Criteria) this;
        }

        public Criteria andOilNotEqualTo(String value) {
            addCriterion("OIL <>", value, "oil");
            return (Criteria) this;
        }

        public Criteria andOilGreaterThan(String value) {
            addCriterion("OIL >", value, "oil");
            return (Criteria) this;
        }

        public Criteria andOilGreaterThanOrEqualTo(String value) {
            addCriterion("OIL >=", value, "oil");
            return (Criteria) this;
        }

        public Criteria andOilLessThan(String value) {
            addCriterion("OIL <", value, "oil");
            return (Criteria) this;
        }

        public Criteria andOilLessThanOrEqualTo(String value) {
            addCriterion("OIL <=", value, "oil");
            return (Criteria) this;
        }

        public Criteria andOilLike(String value) {
            addCriterion("OIL like", value, "oil");
            return (Criteria) this;
        }

        public Criteria andOilNotLike(String value) {
            addCriterion("OIL not like", value, "oil");
            return (Criteria) this;
        }

        public Criteria andOilIn(List<String> values) {
            addCriterion("OIL in", values, "oil");
            return (Criteria) this;
        }

        public Criteria andOilNotIn(List<String> values) {
            addCriterion("OIL not in", values, "oil");
            return (Criteria) this;
        }

        public Criteria andOilBetween(String value1, String value2) {
            addCriterion("OIL between", value1, value2, "oil");
            return (Criteria) this;
        }

        public Criteria andOilNotBetween(String value1, String value2) {
            addCriterion("OIL not between", value1, value2, "oil");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("CREATETIME like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("CREATETIME not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}