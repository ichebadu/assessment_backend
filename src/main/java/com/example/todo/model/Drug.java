package com.example.todo.model;





//[//]: # (Your task:)
//
//        [//]: # ()
//        [//]: # (Create a simple functional Drug List Application  )
//
//        [//]: # (Create a To-do with the following parameters &#40;Drug Id, Drug name, Brand Name, Date Created, Status&#41;  )
//
//        [//]: # (List the Drugs that was created.  )
//
//        [//]: # (Viewing of a Drug list)
//
//        [//]: # ()
//        [//]: # ()
//        [//]: # ()
//        [//]: # (Version Control  )
//
//        [//]: # (Create a public repo  )
//
//        [//]: # (Push code on the repo  )
//
//        [//]: # (Share requisite URLs on chat)
//
//        [//]: # ()
//        [//]: # ()
//        [//]: # ()
//        [//]: # (Instructions:)
//
//        [//]: # ()
//        [//]: # ()
//        [//]: # ()
//        [//]: # (Keep your camera on at all times when you are working on the application.)
//
//        [//]: # (You will be required to complete the work and demonstrate the completed application in 1.5 hours.)
//
//        [//]: # (Push the code to the repo immediately after the demonstration.)
//
//        [//]: # (The session will be recorded.)
//
//        [//]: # ()
//        [//]: # (Good Luck!)
//
//        [//]: # ()
//        [//]: # (Recording has started)
//
//        [//]: # (09:41 Recording has started)

//[//]: # (Create a To-do with the following parameters &#40;ç#41;  )

import com.example.todo.constants.Status;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.context.TenantIdentifierMismatchException;

import java.time.LocalDateTime;
@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="drug")
public class Drug {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  Long id;
    @Column(nullable = false)
    private String name;
    private String brand;

    private Status status;

    private LocalDateTime createdDate;

}
