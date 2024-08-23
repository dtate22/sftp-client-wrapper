package com.springml;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.springml.sftp.client.*;

public class JavaTest1 {
    public static void main(String []args) throws Exception
    {
        System.out.println("My First Java Program.");

        sftpClient = new SFTPClient(IDENTITY, USERNAME, PASSWORD, HOST);
        //cryptoSftpClient = new SFTPClient(IDENTITY, PASSPHRASE, USERNAME, PASSWORD, HOST, PORT, true, KEY, ALGORITHM);

        copyTest();

    }

    private static final String IDENTITY = null;
    private static final String PASSPHRASE = null;
    private static final String USERNAME = "MISSYNFTP"; // "user";
    private static final String PASSWORD = "2WA<tqp57=6>";
    private static final String HOST = "live-ftp.origamirisk.com"; // "ftp.ftp.com";
    private static final int PORT = 22;
    private static final String KEY = "0123456789abcdef";
    private static final String ALGORITHM = "AES";

    private static SFTPClient sftpClient;
    private static SFTPClient cryptoSftpClient;

    public void setup() {
        sftpClient = new SFTPClient(IDENTITY, USERNAME, PASSWORD, HOST);
        //cryptoSftpClient = new SFTPClient(IDENTITY, PASSPHRASE, USERNAME, PASSWORD, HOST, PORT, true, KEY, ALGORITHM);
        //cryptoSftpClient = new SFTPClient(IDENTITY, PASSPHRASE, USERNAME, PASSWORD, HOST, PORT, true, KEY, ALGORITHM);

    }

    public static void copyTest() throws Exception {
        // Test created by Derrick Tate
        String a = sftpClient.copyToFTP("/home/dtate22/sample.csv", "/sample.csv");
        assertTrue(true);
    }

}
