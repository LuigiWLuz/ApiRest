Diagrama de Classes
<hr></hr>

```mermaid
classDiagram
    class Usuario {
        -String name
        -Account account
        -Features features
        -Card card
        -News news
    }

    class Account {
        -String number
        -String agency
        -float balance
        -float limit
    }

    class Features {
        -String icon
        -String description
    }

    class Card {
        -String number
        -float limit
    }

    class News {
        -String icon
        -String description
    }

    Usuario "1" *-- "1" Account
    Usuario "1" *-- "n" Features
    Usuario "1" *-- "1" Card
    Usuario "1" *-- "n" News
 ```
