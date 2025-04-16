<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Controle de Cloro-Livre</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <h1>Controle de Cloro-Livre</h1>
        <form id="cloroForm">
            <label for="dataRegistro">Data de Registro:</label>
            <input type="date" id="dataRegistro" name="dataRegistro" required><br><br>

            <label for="pontosLocalizacao">Pontos de Localização:</label>
            <input type="text" id="pontosLocalizacao" name="pontosLocalizacao" required><br><br>

            <label for="saidaTratamento">Saída de Tratamento:</label>
            <input type="text" id="saidaTratamento" name="saidaTratamento" required><br><br>

            <label for="cozinha">Cozinha:</label>
            <input type="text" id="cozinha" name="cozinha" required><br><br>

            <label for="producao">Produção:</label>
            <input type="text" id="producao" name="producao" required><br><br>

            <label for="administrativo">Administrativo:</label>
            <input type="text" id="administrativo" name="administrativo" required><br><br>

            <label for="recebimento">Recebimento:</label>
            <input type="text" id="recebimento" name="recebimento" required><br><br>

            <label for="fotos">Adicionar Fotos:</label>
            <input type="file" id="fotos" name="fotos" accept="image/*" multiple><br><br>

            <button type="button" onclick="gerarPDF()">Gerar PDF</button>
        </form>
    </div>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.min.js"></script>
    <script src="scripts.js"></script>
</body>
</html>
