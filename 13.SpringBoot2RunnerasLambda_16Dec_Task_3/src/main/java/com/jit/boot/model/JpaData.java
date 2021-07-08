package com.jit.boot.model;

public class JpaData {
	private String dialect;
	private boolean showSql;
	private String ddlAuto;
	public String getDialect() {
		return dialect;
	}
	public void setDialect(String dialect) {
		this.dialect = dialect;
	}
	public boolean isShowSql() {
		return showSql;
	}
	public void setShowSql(boolean showSql) {
		this.showSql = showSql;
	}
	public String getDdlAuto() {
		return ddlAuto;
	}
	public void setDdlAuto(String ddlAuto) {
		this.ddlAuto = ddlAuto;
	}
	@Override
	public String toString() {
		return "JpaData [dialect=" + dialect + ", showSql=" + showSql + ", ddlAuto=" + ddlAuto + "]";
	}
	
	

}
