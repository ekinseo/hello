package ssw.ekinseo;

public class GitTest {
	private int gitName;
	private String gitURL;
	
	public GitTest(int gitName, String gitURL) {
		this.gitName = gitName;
		this.gitURL = gitURL;
	}
	
	public void SetGitName(int gitName) {
		this.gitName = gitName;
	}
	public int GetGitName() {
		return this.gitName;
	}
	public void setGitURL(String gitURL) {
		this.gitURL = gitURL;
	}
	public String GetGitURL() {
		return this.gitURL;
	}
}
