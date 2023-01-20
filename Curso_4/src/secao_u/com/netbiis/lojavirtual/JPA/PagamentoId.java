package secao_u.com.netbiis.lojavirtual.JPA;
// Generated 7 de nov. de 2022 21:22:12 by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PagamentoId generated by hbm2java
 */
@Embeddable
public class PagamentoId implements java.io.Serializable {

	private String cpf;
	private int cdCurso;

	public PagamentoId() {
	}

	public PagamentoId(String cpf, int cdCurso) {
		this.cpf = cpf;
		this.cdCurso = cdCurso;
	}

	@Column(name = "cpf", nullable = false, length = 12)
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Column(name = "cdCurso", nullable = false)
	public int getCdCurso() {
		return this.cdCurso;
	}

	public void setCdCurso(int cdCurso) {
		this.cdCurso = cdCurso;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PagamentoId))
			return false;
		PagamentoId castOther = (PagamentoId) other;

		return ((this.getCpf() == castOther.getCpf())
				|| (this.getCpf() != null && castOther.getCpf() != null && this.getCpf().equals(castOther.getCpf())))
				&& (this.getCdCurso() == castOther.getCdCurso());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCpf() == null ? 0 : this.getCpf().hashCode());
		result = 37 * result + this.getCdCurso();
		return result;
	}

}