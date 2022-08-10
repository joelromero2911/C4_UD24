# C4_UD24

<h2>Endpoints</h2>

1) Shows all workers.<br>
[GET] /api/trabajadores<br>

2) Shows all workers with the specified jobs asigned.<br>
  Available jobs:
    - informatico
    - politico
[GET] /api/trabajadores/trabajo/{trabajo}<br>

3) Saves on the DB the worker that you specify in the requested body always that its with correct parameters.<br>
  Example:
    {
        "nombre": "Joel",
        "trabajo": "informatico",
    }<br>
[POST] /api/trabajadores<br>

4) Shows the worker with the specified id.<br>
[GET] /api/trabajadores/{id}<br>

5) Updates the worker with the specified id with the parameters in the requested body.<br>
[PUT] /api/trabajadores/{id}<br>

6) Deletes the worker with the specified id.<br>
[DELETE] /api/trabajadores/{id}<br>
