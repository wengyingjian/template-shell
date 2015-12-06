package com.asd.template.channel;

import java.io.IOException;

import com.asd.template.shell.Shell;

public class JschChannelTest {

	static Shell jschChannel = new Shell("192.168.2.118", "root", "admin");

	public static void main(String[] args) throws IOException {
//		PipedOutputStream pos = new PipedOutputStream();
//		InputStream input = new PipedInputStream(pos);
//
//		jschChannel.shell(input, System.out);
//		PrintWriter pw = new PrintWriter(pos);
//		pw.println("ps -ef | grep tomcat");
//		pw.flush();

		checkIsNull(null, null);
		// jschChannel.sftp("/Users/wyj/Documents/g_new.zip", ".",null);
	}


	public static  void checkIsNull(Object... objects) {
		System.out.println(objects);
	}
}
