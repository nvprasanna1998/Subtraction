package com.Program.Controller;

import com.Program.Service.SubService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class SubController {
    private final SubService subService;

    public SubController(SubService subService) {
        this.subService = subService;
    }

    @PostMapping("/sub")
    public Result subNumbers(@RequestBody NumbersRequest request) {
        int result = SubService.subNumbers(request.getA(), request.getB());

        return new Result(result, request.getA(), request.getB());
    }


    public static class NumbersRequest {
        private int a;
        private int b;

        // getters and setters

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }


    }

    public static class Result {
        private int result;
        private int a;
        private int b;

        public Result(int result, int a, int b) {
            this.result = result;
            this.a = a;
            this.b = b;


        }

        public int getResult() {
            return result;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

    }

    }