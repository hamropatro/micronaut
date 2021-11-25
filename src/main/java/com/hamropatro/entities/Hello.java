/* (C) Hamro Patro 2021 */
package com.hamropatro.entities;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "hello", schema = "public")
public class Hello {

	@Id
	private String id;
}
