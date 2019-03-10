package com.zeromaps;

import java.io.FileOutputStream;
import java.util.Arrays;

import com.zeromaps.fs.DataTypes;
import com.zeromaps.fs.ZeromapsfsAPI;

public class ZeromapsfsAPIExample {
	public static void main(String[] args) throws Exception {
	String dirPath = "D:/ifileDB.bak";
//	Options options = new Options().setCreateIfMissing(false);
//	RocksDB db = RocksDB.open(options, dirPath);
//	RocksIterator itr = db.newIterator();
//	itr.seekToFirst();
//	System.out.println(itr.isValid());
//	while(itr.isValid()) {
//		byte[] b = itr.key();
//		byte[] v = itr.value();
//		System.out.println(Arrays.toString(b));
//		System.out.println(Arrays.toString(v));
//	}
	
	ZeromapsfsAPI api = new ZeromapsfsAPI(dirPath);
	byte[] res = api.getData("001", DataTypes.IFileType, true);
	System.out.println(Arrays.toString(res));
	String outfileName = "test.jpg";
	FileOutputStream f = new FileOutputStream(outfileName);
	f.write(res);
	f.close();
}

}

//public static void main(String[] args) throws Exception {
//String dirPath = "D:/ifileDB.bak";
////Options options = new Options().setCreateIfMissing(false);
////RocksDB db = RocksDB.open(options, dirPath);
////RocksIterator itr = db.newIterator();
////itr.seekToFirst();
////System.out.println(itr.isValid());
////while(itr.isValid()) {
////	byte[] b = itr.key();
////	byte[] v = itr.value();
////	System.out.println(Arrays.toString(b));
////	System.out.println(Arrays.toString(v));
////}
//
//ZeromapsfsAPI api = new ZeromapsfsAPI(dirPath);
//byte[] res = api.getData("001", DataTypes.IFileType, true);
//System.out.println(Arrays.toString(res));
//String outfileName = "020.jpg";
//FileOutputStream f = new FileOutputStream(outfileName);
//f.write(res);
//f.close();
//}