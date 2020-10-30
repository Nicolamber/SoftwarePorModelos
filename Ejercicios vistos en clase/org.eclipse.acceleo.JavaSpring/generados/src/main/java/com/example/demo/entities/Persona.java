package com.example.demoAcceleo.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="persona")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Audited
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name="nombre")
	private String Nombre;
	@Column(name="edad")
	private int Edad;
	@Column(name="dni")
	private int Dni;
}


