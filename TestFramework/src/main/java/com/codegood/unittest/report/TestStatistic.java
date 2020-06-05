package com.codegood.unittest.report;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "statistic")
public class TestStatistic {

    @XmlElement
    private boolean hasPassed;

    @XmlElement
    private String fullName;

    public void setHasPassed(boolean hasPassed) {
        this.hasPassed = hasPassed;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean hasNotPassed() {
        return !hasPassed;
    }
}
