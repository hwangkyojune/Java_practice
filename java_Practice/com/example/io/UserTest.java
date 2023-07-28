package com.example.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserTest {
    public static void main(String[] args) throws Exception {
        User u1 = new User("홍길동","shane@naver.com","1998");
        User u2 = new User("구길동","shane@naver.com","1998");
        User u3 = new User("김길동","shane@naver.com","1998");

        List<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);

        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        ObjectOutputStream o = new ObjectOutputStream(ba);

        o.writeObject(users);

        ba.close();
        o.close();

        byte[] array = ba.toByteArray();



        ByteArrayInputStream bi = new ByteArrayInputStream(array);
        ObjectInputStream oi = new ObjectInputStream(bi);

        ArrayList<User> users2 = (ArrayList)oi.readObject();
        bi.close();
        oi.close();

        System.out.println(users2);



        ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream("userInfo.dat"));
        out.writeObject(u1);

        ObjectInputStream in = new ObjectInputStream( new FileInputStream("userInfo.dat"));
        User u4 = (User)in.readObject();
        System.out.println(u4);
    }
}
