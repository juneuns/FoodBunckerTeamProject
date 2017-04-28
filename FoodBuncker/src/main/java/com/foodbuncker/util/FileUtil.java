package com.foodbuncker.util;

import java.io.File;

/*
 * 	이 클래스는 파일 업로드에 필요한 기능을 처리하기 위해서 만든
 * 	유틸리티 클래스이다.
 */
public class FileUtil {
	//	파일의 이름이 중복되면 덮어쓰기를 하게 된다.
	//	그러므로 혹시 같은 이름의 파일이 존재하면 파일의 이름을 바꾸어서
	//	저장할 필요가 있다.
	//		같은 이름의 파일이 존재하면 파일의 이름을 바꿔주는 함수를 만들자.
	public static String rename(String path, String oldName) { 
		//	약속
		//		혹시 같은 이름의 파일이 존재하면 (1)을 붙여서 이름을 바꾸는 
		//		방식을 사용하자.
		//		예>			sample.txt			sample(1).txt		sample(2).txt
		int		count = 0;		//	뒤에 붙일 번호를 기억할 변수
		String	tempName = oldName;		//	현재 이름을 따로 기억해 놓는다.
		File		file = new File(path, oldName);
		while(file.exists()) {
			//	존재하는 경우가 발생하면.....	이름을 바꾸어야 한다.
			//	붙일 번호를 증가시킨다.
			count++;
			//	.을 기준으로해서 앞의 내용과 뒤에 내용을 분리한다.
			int		len = tempName.lastIndexOf(".");
			String	temp1 = tempName.substring(0, len);
			//		sample
			String	temp2 = tempName.substring(len + 1);
			//		txt
			
			//	이제 분리된 것에 필요한 번호를 붙여서 다시 합친다.
			oldName = temp1 + "(" + count + ")." + temp2;
			//	이런파일도 존재하는지 확인하기 위해서
			//	다시 File 객체로 만들어서 확인한다.
			file = new File(path, oldName);
		}
		return oldName;
	}
}