function gerarPDF() {
    const form = document.getElementById('cloroForm');
    const dataRegistro = form.dataRegistro.value;
    const pontosLocalizacao = form.pontosLocalizacao.value;
    const saidaTratamento = form.saidaTratamento.value;
    const cozinha = form.cozinha.value;
    const producao = form.producao.value;
    const administrativo = form.administrativo.value;
    const recebimento = form.recebimento.value;
    const fotos = form.fotos.files;

    let fotosHTML = '';
    for (let i = 0; i < fotos.length; i++) {
        const reader = new FileReader();
        reader.onload = function(e) {
            fotosHTML += `<img src="${e.target.result}" style="width:100px;height:100px;margin:5px;">`;
            if (i === fotos.length - 1) {
                gerarPDFComDados(dataRegistro, pontosLocalizacao, saidaTratamento, cozinha, producao, administrativo, recebimento, fotosHTML);
            }
        };
        reader.readAsDataURL(fotos[i]);
    }

    if (fotos.length === 0) {
        gerarPDFComDados(dataRegistro, pontosLocalizacao, saidaTratamento, cozinha, producao, administrativo, recebimento, fotosHTML);
    }
}

function gerarPDFComDados(dataRegistro, pontosLocalizacao, saidaTratamento, cozinha, producao, administrativo, recebimento, fotosHTML) {
    const content = `
        <h1>Relatório de Cloro-Livre</h1>
        <p><strong>Data de Registro:</strong> ${dataRegistro}</p>
        <p><strong>Pontos de Localização:</strong> ${pontosLocalizacao}</p>
        <p><strong>Saída de Tratamento:</strong> ${saidaTratamento}</p>
        <p><strong>Cozinha:</strong> ${cozinha}</p>
        <p><strong>Produção:</strong> ${producao}</p>
        <p><strong>Administrativo:</strong> ${administrativo}</p>
        <p><strong>Recebimento:</strong> ${recebimento}</p>
        <div>${fotosHTML}</div>
    `;

    const opt = {
        margin: 1,
        filename: 'relatorio_cloro_livre.pdf',
        html2canvas: {},
        jsPDF: { format: 'a4' }
    };

    html2pdf().from(content).set(opt).save();
}
