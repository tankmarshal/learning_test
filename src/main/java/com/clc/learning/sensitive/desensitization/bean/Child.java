package com.clc.learning.sensitive.desensitization.bean;

import javafx.scene.Parent;
import red.zyc.desensitization.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Child {
    @ChineseNameSensitive
    private String name = "李富贵";

    @IdCardNumberSensitive
    private String idCardNumber = "321181199301096000";

    @UsccSensitive
    private String unifiedSocialCreditCode = "91310106575855456U";

    @CharSequenceSensitive
    private String string = "123456";

    @EmailSensitive
    private String email = "123456@qq.com";

    @PasswordSensitive
    private String password = "123456";

    //@CascadeSensitive
    //private Mother mother = new Mother();

    //@CascadeSensitive
    //private Father father = new Father();

    private @PasswordSensitive String[] passwords = {"123456", "1234567", "12345678"};

    //private List<@CascadeSensitive Parent> parents1 = Stream.of(new Father(), new Mother()).collect(Collectors.toList());

    private List<@EmailSensitive String> emails1 = Stream.of("123456@qq.com", "1234567@qq.com", "1234568@qq.com").collect(Collectors.toList());

    private Map<@ChineseNameSensitive String, @EmailSensitive String> emails2 = Stream.of("张三", "李四", "小明").collect(Collectors.toMap(s -> s, s -> "123456@qq.com"));

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getUnifiedSocialCreditCode() {
        return unifiedSocialCreditCode;
    }

    public void setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
        this.unifiedSocialCreditCode = unifiedSocialCreditCode;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getPasswords() {
        return passwords;
    }

    public void setPasswords(String[] passwords) {
        this.passwords = passwords;
    }

    public List<String> getEmails1() {
        return emails1;
    }

    public void setEmails1(List<String> emails1) {
        this.emails1 = emails1;
    }

    public Map<String, String> getEmails2() {
        return emails2;
    }

    public void setEmails2(Map<String, String> emails2) {
        this.emails2 = emails2;
    }
}
