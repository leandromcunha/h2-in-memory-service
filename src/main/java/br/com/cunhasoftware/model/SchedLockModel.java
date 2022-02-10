package br.com.cunhasoftware.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.repository.Temporal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table
@Entity( name = "shedlock")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class SchedLockModel implements Serializable {

	private static final long serialVersionUID = 8924708543465135362L;

	@Id
	private String name;

	@Column(name = "lock_until")
	private Timestamp lockUntil;

	@Column(name = "locked_at")
	private Timestamp lockedAt ;

	@Column(name = "locked_by")
	private String lockedBy;
}
