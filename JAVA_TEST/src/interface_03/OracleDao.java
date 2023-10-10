package interface_03;

public class OracleDao extends DataAccess{

	@Override
	public void select() {
		System.out.println("오라클 검색");
	}

	@Override
	public void insert() {
		System.out.println("오라클 삽입");

	}

	@Override
	public void update() {
		System.out.println("오라클 수정");

	}

	@Override
	public void delete() {
		System.out.println("오라클 삭제");

	}

}
