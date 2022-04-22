DIR="/Users/ccreanga/projects/personal/spark-moderndataengineering"

cd $DIR/ch-15/spark-on-kubernetes/spark-redis-streams
kubectl create configmap spark-redis-streams-conf --from-file=config -n spark-apps
kubectl get configmap/spark-redis-streams-conf -n spark-apps -o yaml
kubectl apply -f deployment-redis-streams.yaml