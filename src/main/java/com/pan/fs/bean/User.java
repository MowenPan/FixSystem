package com.pan.fs.bean;

public class User {
    private Long uid;

    private String logname;

    private String password;

    private String lastLog;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getLogname() {
        return logname;
    }

    public void setLogname(String logname) {
        this.logname = logname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastLog() {
        return lastLog;
    }

    public void setLastLog(String lastLog) {
        this.lastLog = lastLog;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * Title: toString
	 * Description: TODO
	 *
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [uid=" + uid + ", logname=" + logname + ", password=" + password + ", lastLog=" + lastLog + "]";
	}

}