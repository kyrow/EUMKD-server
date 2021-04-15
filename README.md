# Maven  Install
## How TO
https://maven.apache.org/guides/getting-started/windows-prerequisites.html  
## Where to download
https://downloads.apache.org/maven/maven-3/3.8.1/binaries/apache-maven-3.8.1-bin.zip
# Build
`cd {profect-root}`  
`mvn clean install`
# Run
`{profect-root}/target`  
`java -jar eumkd-1.0.jar isr.eumkd.EumkdApplication`
# Request to
http://localhost:8080/test/{id}

# Where to change
main/java/isr/eumkd/services/TestService/getRightAnswers

# What to send example 
[
    {
        "questionNumber": 1,
        "answer": "a"
    },
    {
        "questionNumber": 2,
        "answer": "a"
    },
    {
        "questionNumber": 3,
        "answer": "a"
    },
    {
        "questionNumber": 4,
        "answer": "a"
    },
    {
        "questionNumber": 5,
        "answer": "a"
    },
    {
        "questionNumber": 6,
        "answer": "a"
    },
    {
        "questionNumber": 7,
        "answer": "a"
    },
    {
        "questionNumber": 8,
        "answer": "a"
    },
    {
        "questionNumber": 9,
        "answer": "a"
    },
    {
        "questionNumber": 10,
        "answer": "a"
    }
]

# What will respond example 
{
    "correctAnswersAmount": 9,
    "questionsAmount": 10
}