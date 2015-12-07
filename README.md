##使用jsch实现java控制shell功能：
**1.shell：以流的形式控制**
**2.sftp：上传文件，并且输出日志到控制台**

**注意：**
默认ssh端口：22
默认连接超时时间：30000ms
	
	Shell.shell(inputStream,outputStream):
		inputStream:输入到shell服务器的流
		outputStream:从shell服务器输出的流
		可以通过pipedInputStream/pipedOutoutStream来控制流
	
	Shell.sftp(sourceFile,destDir)
		sourceFile:要拷贝的文件的路径（推荐绝对路径），该文件在本地
		destDir:文件拷贝到的目标目录（推荐绝对路径），该目录在远程服务器


