document.addEventListener('DOMContentLoaded', function () {
    // Preencha os dados dinamicamente (exemplo)
    document.getElementById('data-registro').textContent = new Date().toLocaleDateString();
    document.getElementById('pontos-localizacao').textContent = 'Lat: -23.5505, Long: -46.6333';
    document.getElementById('cozinha').textContent = '10 unidades';
    document.getElementById('producao').textContent = '20 unidades';
    document.getElementById('administracao').textContent = '5 unidades';
    document.getElementById('recebimento').textContent = '15 unidades';

    // Função para gerar PDF
    document.getElementById('download-pdf').addEventListener('click', function () {
        const content = document.getElementById('content');
        html2pdf().from(content).save('relatorio.pdf');
    });
});
