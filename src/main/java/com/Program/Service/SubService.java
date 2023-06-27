package com.Program.Service;

import org.springframework.stereotype.Service;

@Service
public class SubService {
    public static int subNumbers(int a, int b) {
        int res = (a)-(b);
        return res;
    }
}
