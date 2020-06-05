package com.codegood.unittest.report;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "statistics")
public class TestStatistics {

    @XmlElement()
    private int errorCount;

    @XmlElement()
    private int runCount;

    @XmlElementWrapper(name = "testStatistics")
    @XmlElement(name = "statistic")
    private List<TestStatistic> statistics = new ArrayList<>();

    public void addStatistic(String classFullName, boolean hasPassed) {
        TestStatistic newStatistic = new TestStatistic();
        newStatistic.setFullName(classFullName);
        newStatistic.setHasPassed(hasPassed);
        this.statistics.add(newStatistic);
        this.runCount++;
        if (!hasPassed) {
            this.errorCount++;
        }
    }

    public void setStatistics(List<TestStatistic> statistics) {
        this.statistics = statistics;
        this.runCount = statistics.size();
        this.errorCount =(int) statistics.stream().filter(TestStatistic::hasNotPassed).count();
    }
}
