@cucumber
Feature: el usuario hace pruebas en mercado libre

  @empleado
  Scenario Outline: : El usuario lee el primer correo
    Given Iniciar Test
    And login Admin admin123
    And seleccionar Recruitment
    And agregar Candidato <nombre> <segundoNombre> <apellido> <correo> <contactnumber> <notas> <aplicacionFecha> <vacanci>
    Examples:
      | nombre | segundoNombre | apellido  | correo              | contactnumber | notas  | aplicacionFecha | vacanci                  |
      | camilo | camilo        | rodriguez | pruebas@gmail.com   | 31181101121   | prueba | 2024-25-10      | Junior_Account_Assistant |
      | juan   | alverto       | mamian    | pruebas01@gmail.com | 31181101122   | prueba | 2024-25-10      | Payroll_Administrator    |
      | luis   | victor        | cardenas  | pruebas02@gmail.com | 31181101123   | prueba | 2024-25-10      | Sales_Representative     |
      | jorge  | leonardo      | ventrevo  | pruebas03@gmail.com | 31181101124   | prueba | 2024-25-10      | Senior_QA_Lead           |




