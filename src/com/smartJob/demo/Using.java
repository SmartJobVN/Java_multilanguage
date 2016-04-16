package com.smartJob.demo;

public class Using {

    public static void main(String[] args) {
        String prefix = LanguagesController.getText("message.prefix") + " ";       
        String message = LanguagesController.getText("com.infoTech.highProfile.SmartJob");
        System.out.println(prefix + message + ".");
    }

}

// Kết quả nếu máy bạn tính của sử dụng ngôn ngữ tiếng Việt :
// Bạn đang xem website của Công ty cổ phần SmartJob.

// Kết quả nếu máy bạn tính của sử dụng ngôn ngữ tiếng Anh :
// You are viewing website of SmartJob joint stock company.