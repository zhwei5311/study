package com.study.netExe;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExe1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("连接成功".getBytes());
        socket.close();
    }
}
