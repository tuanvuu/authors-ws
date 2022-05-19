package com.skb.course.apis.authorsws.security;

public class SecurityConstants {

    public static final byte[] secret = System.getProperty("jwt.secret").getBytes();
}
