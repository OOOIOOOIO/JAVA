package file;

public class Explain {

}
/*
					<파일 입출력>

Writer(입력) 2byte 단위

- bufferedWriter : 버퍼를 사용해서 파일 작성
- FileWriter : 경로에 파일 생성
- OutputStreamWriter : byte 단위
- write(byte[] b, int off, int len)
	-> byte배열에 저장, off는 시작위치, len는 갯수



Reader(풀력) 2byte 단위

- bufferedReader : 버퍼를 사용해서 파일 읽기
- FileReader : 경로에 있는 파일 로드
- InputStreamReader : byte 단위
- read() : 1byte씩 읽기 때문에 느림
- read(byte[] b) : byte배열에 저장




*/