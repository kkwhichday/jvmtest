package com.remote.service;

import org.springframework.stereotype.Service;

@Service("remoteService")
public class RemoteServiceImpl {
    public String getSth(String a){
        return "hello"+a;
    }
}
