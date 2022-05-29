package com.api.parkingcontrol.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable; //Controla conversoes de dados
import java.time.LocalDateTime;
import java.util.UUID; //Identificador que identifica o tipo ID

@Getter
@Setter
@Entity //Define a classe como uma entidade na base de dados
@Table(name = "TB_PARKING_SPOT") //Denine o nome da tabela
public class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID = 1L;

    //Atributos
    @Id //Define o idetificador da entidade
    @GeneratedValue(strategy = GenerationType.AUTO) //Gera um valor para o id automaticamente
    private UUID id;
    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;
    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;
    @Column(nullable = false, length = 70)
    private String brandCar;
    @Column(nullable = false, length = 70)
    private String modelCar;
    @Column(nullable = false, length = 70)
    private String colorCar;
    @Column(nullable = false)
    private LocalDateTime registrationDate;
    @Column(nullable = false, length = 130)
    private String responsibleName;
    @Column(nullable = false, length = 30)
    private String apartment;
    @Column(nullable = false, length = 30)
    private String block;
}
