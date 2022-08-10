# C4_UD24

<h2>Endpoints</h2>

1) Shows all workers.
[GET] /api/trabajadores

2) Shows all workers with the specified jobs asigned.
  Available jobs:
    - informatico
    - politico
[GET] /api/trabajadores/trabajo/{trabajo}

3) Saves on the DB the worker that you specify in the requested body always that its with correct parameters.
  Example:
    {
        "nombre": "Joel",
        "trabajo": "informatico",
    }
[POST] /api/trabajadores

4) Shows the worker with the specified id.
[GET] /api/trabajadores/{id}

5) Updates the worker with the specified id with the parameters in the requested body.
[PUT] /api/trabajadores/{id}

6) Deletes the worker with the specified id.
[DELETE] /api/trabajadores/{id}
