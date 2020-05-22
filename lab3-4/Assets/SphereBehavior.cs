using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class SphereBehavior : MonoBehaviour
{
    void Start() {
        this.GetComponent<Renderer> ().material.color = Color.green;
        InvokeRepeating("CustomUpdate", 1.0f, 1.0f);
    }

    void CustomUpdate()
    {
        this.transform.position = new Vector3(
            this.transform.position.x + UnityEngine.Random.Range(-1, 2), 
            this.transform.position.y + UnityEngine.Random.Range(-1, 2),
            this.transform.position.z + UnityEngine.Random.Range(-1, 2)
        );
    }
}
