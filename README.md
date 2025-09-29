# GestionHidricaJPA
este es el proyecto gestion de agua potable en java netbeans  desarollo de software 
este paquete contiene el nucleo de cominio o mas bien las reglas de negocio y la cual esta diseñado para ser independiente 

estructura del paquete del cualq acabo de diseñar 

dominio /
entities/           #entidades de dominio = cliente , factura , medidor , plantas res 
valueobjects        # value objects inmutable direccion email telefono consumo 
services            # servicio de dominio serviciofacturacion , serviciomantenimiento
events/              # Eventos de dominio FacturaGenerada, IncidenciaRegistrada
exceptions/          # Excepciones específicas del dominio
factories/           # Factories para creación consistente de entidades ClienteFactory
builders/            # Builders para objetos complejos facturaBuilder
specifications/      # Implementaciones del patrón Specification
ports/               # Interfaces puertos  que la infraestructura debe implementar
aggregates/          # Agregados y raíces Cliente agregado, Planta agregado
repositories/        # Interfaces repository definidas como puertos
to/                 # DTOs internos si son necesarios para eventos opcionales

integracion con la infraestructura 
se implmentan las interfaces en domain/reports en el pauete ingfra o adaters 
 en la capa de configuraciones 
 en el dominio no conoce implementaciones concretas 


 convenciones y principios 



 independcia   no se usan anotaciones ni dependecias del framweor 
 inmutabilidad  value object se implementa como clase inmutable 
  exepciones  de dominio  no se usan para comunicar 
  puertos  todas las comunicaciones cpn el mundo exteriro usan interfaces en ports 
  
