package com.clc.learning.designpattern.builder;

import java.util.Date;

public class BuilderTest {
    public static void main(String[] args) {
        HumanityBuilder humanityBuilder = new HumanityBuilder();
        Humanity humanity = humanityBuilder.buildName("name").buildBirthDate(new Date()).buildAddress("").build();
    }
}
