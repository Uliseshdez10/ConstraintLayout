import socket

def port_scan(target_host, target_port):
    try:
        # Crea un objeto de socket
        sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        # Establece un tiempo de espera para la conexión
        sock.settimeout(2)

        # Intenta conectar al host y puerto objetivo
        result = sock.connect_ex((target_host, target_port))

        if result == 0:
            print(f"El puerto {target_port} está abierto en el host {target_host}")
        else:
            print(f"El puerto {target_port} está cerrado en el host {target_host}")

        sock.close()

    except socket.error as e:
        print(f"Error al conectar al host: {str(e)}")

# Ejemplo de uso
target_host = "www.unipolidgo.edu.mx"
target_port = 800  # Puerto que deseas analizar

port_scan(target_host, target_port)
