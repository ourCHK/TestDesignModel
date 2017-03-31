package chapter3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int read() throws IOException {
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase((char)c));
	}

	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		int result  = super.read(b, off, len);
		for(int i=off; i<len+result;i++) {
			b[i] = (byte) Character.toLowerCase((char)b[i]);
		}
		return result;
	}
	
	

}
