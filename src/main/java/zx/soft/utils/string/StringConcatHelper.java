package zx.soft.utils.string;

/**
 * 字符串连接工具类
 * @author donglei
 *
 */
public class StringConcatHelper {
	private StringBuilder sBuilder = new StringBuilder();
	private ConcatMethod method;

	public StringConcatHelper(ConcatMethod method) {
		this.method = method;
	}

	public void setMethod(ConcatMethod method) {
		this.method = method;
		clear();
	}

	public void add(String item) {
		method.concat(sBuilder, item);
	}

	public String getString() {
		return sBuilder.toString();

	}

	public void clear() {
		sBuilder.delete(0, sBuilder.length());
		sBuilder.trimToSize();

	}

}
