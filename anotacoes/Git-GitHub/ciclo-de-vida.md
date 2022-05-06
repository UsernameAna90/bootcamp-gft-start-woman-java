# Ciclo de vida dos arquivos

### Untracked
Um arquivo ou atualizacao foi criada, porem o git ainda nao esta consciente.

### Tracked
O git esta consciente de que um arquivo ou atualizacao foi criada, e segue rastreando seus estados:

- Unmodified. Atualizacoes nao foram realizadas. 

- Modified. Atualizacoes foram realizadas.

- Staged. Atualizacoes prontas para serem salvas.

Apos serem salvas as atualizacoes, o estado do arquivo retorna para unmodified e o ciclo reinicia.

# Repositorios utilizados nos diferentes estados do arquivo

- Working Directory: Local onde sao realizadas as atualizacoes de um arquivo.

- Staging Area: Local onde as atualizacoes esperam para serem salvas.
 
- Local Repository: Local onde sao armazenadas as versoes salvas e atualizadas de um arquivo.