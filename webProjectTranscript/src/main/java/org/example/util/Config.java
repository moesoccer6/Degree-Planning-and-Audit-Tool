package org.example.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Config {

    @Value("#{${cs.courses.c1}}")
    private Map<String,String> csCourses;

    @Value("#{${cs.courses.c2}}")
    private Map<String,String> csCoreCourses;

    @Value("#{${cs.courses.pre}}")
    private Map<String,String> csPreReqCourses;


    @Value("#{${ds.courses.c1}}")
    private Map<String,String> dsCourses;

    @Value("#{${ds.courses.c2}}")
    private Map<String,String> dsCoreCourses;

    @Value("#{${ds.courses.pre}}")
    private Map<String,String> dsPreReqCourses;

    @Value("#{${ds.courses.c3}}")
    private Map<String,String> dsCoreCoursesc3;

    @Value("#{${ds.courses.c4}}")
    private Map<String,String> dsCoreCoursesc4;


    @Value("#{${is.courses.c1}}")
    private Map<String,String> isCourses;

    @Value("#{${is.courses.c2}}")
    private Map<String,String> isCoreCourses;

    @Value("#{${is.courses.pre}}")
    private Map<String,String> isPreReqCourses;

    @Value("#{${is.courses.c3}}")
    private Map<String,String> isCoreCoursesc3;

    @Value("#{${is.courses.c4}}")
    private Map<String,String> isCoreCoursesc4;

    @Value("#{${ic.courses.c1}}")
    private Map<String,String> icCourses;

    @Value("#{${ic.courses.c2}}")
    private Map<String,String> icCoreCourses;

    @Value("#{${ic.courses.pre}}")
    private Map<String,String> icPreReqCourses;


    @Value("#{${nandt.courses.c1}}")
    private Map<String,String> nandtCourses;


    @Value("#{${nandt.courses.pre}}")
    private Map<String,String> nandtPreReqCourses;


    @Value("#{${tcs.courses.c1}}")
    private Map<String,String> tcsCourses;

    @Value("#{${tcs.courses.c2}}")
    private Map<String,String> tcsCoreCourses;

    @Value("#{${tcs.courses.pre}}")
    private Map<String,String> tcsPreReqCourses;

    @Value("#{${tcs.courses.c3}}")
    private Map<String,String> tcsCoreCoursesc3;

    @Value("#{${tcs.courses.c4}}")
    private Map<String,String> tcsCoreCoursesc4;


    public Map<String, String> getCsCourses() {
        return csCourses;
    }

    public Map<String, String> getCsCoreCourses() {
        return csCoreCourses;
    }

    public Map<String, String> getCsPreReqCourses() {
        return csPreReqCourses;
    }

    public Map<String, String> getDsCourses() {
        return dsCourses;
    }

    public Map<String, String> getDsCoreCourses() {
        return dsCoreCourses;
    }

    public Map<String, String> getDsPreReqCourses() {
        return dsPreReqCourses;
    }

    public Map<String, String> getIsCourses() {
        return isCourses;
    }

    public Map<String, String> getIsCoreCourses() {
        return isCoreCourses;
    }

    public Map<String, String> getIsPreReqCourses() {
        return isPreReqCourses;
    }

    public Map<String, String> getIcCourses() {
        return icCourses;
    }

    public Map<String, String> getIcCoreCourses() {
        return icCoreCourses;
    }

    public Map<String, String> getIcPreReqCourses() {
        return icPreReqCourses;
    }

    public Map<String, String> getNandtCourses() {
        return nandtCourses;
    }


    public Map<String, String> getNandtPreReqCourses() {
        return nandtPreReqCourses;
    }

    public Map<String, String> getTcsCourses() {
        return tcsCourses;
    }

    public Map<String, String> getTcsCoreCourses() {
        return tcsCoreCourses;
    }

    public Map<String, String> getTcsPreReqCourses() {
        return tcsPreReqCourses;
    }

    public Map<String, String> getDsCoreCoursesc3() {
        return dsCoreCoursesc3;
    }

    public Map<String, String> getDsCoreCoursesc4() {
        return dsCoreCoursesc4;
    }

    public Map<String, String> getIsCoreCoursesc3() {
        return isCoreCoursesc3;
    }

    public Map<String, String> getIsCoreCoursesc4() {
        return isCoreCoursesc4;
    }

    public Map<String, String> getTcsCoreCoursesc3() {
        return tcsCoreCoursesc3;
    }

    public Map<String, String> getTcsCoreCoursesc4() {
        return tcsCoreCoursesc4;
    }
}
