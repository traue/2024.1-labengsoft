# Instâncias EC2 para este Lab


## Ansible Control Node

 - Name: Ansible Server
 - AMI: Ubuntu Server 22.04 LTS
 - Instance Type: t2.micro
 - Key par: Cria uma key par (.pem) para este servidor (ansible-key)
 - Security Group:
    - Criar a SG "ansible-sg", liberando a porta 22 (SSH)

## Nodes

Você pode criar todas de uma vez só (basta colocar "3" em "number os instances)

- Name: vprofile-web01; vprofile-02; vprofile-db01
- AMI: Amazon Linux 2023
 - Instance Type: t2.micro
 - Key par: Cria uma key par (.pem) para este servidor (ansible-key)
 - Security Group:
    - Criar a SG "ansible-sg", liberando a porta 22 (SSH)
    - Liberar também a porta 22 a partir do grupo "ansible-SG"

    