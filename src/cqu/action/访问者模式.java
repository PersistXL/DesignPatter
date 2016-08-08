package cqu.action;

public class 访问者模式 {
	public static void main(String[] args) {
		MyVisitor visitor = new MyVisitor();
		MySubjector subjector = new MySubjector();
		subjector.accept(visitor);
	}
}

interface Visitor {
	public void visit(Subjector sub);
}

class MyVisitor implements Visitor {

	@Override
	public void visit(Subjector sub) {
		System.out.println("visit the subject : "+sub.getSubject());
	}
}

interface Subjector {
	public void accept(Visitor visitor);
	public String getSubject();
}

class MySubjector implements Subjector {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String getSubject() {
		return "love";
	}
}


