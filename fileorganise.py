import os
import shutil

FILE_CATEGORIES = {
    "PDFs": [".pdf"],
    "Images": [".jpg", ".jpeg", ".png", ".gif", ".bmp", ".svg", ".webp"],
    "Documents": [".doc", ".docx", ".txt", ".odt", ".rtf", ".md"],
    "Spreadsheets": [".xls", ".xlsx", ".csv", ".ods"],
    "Presentations": [".ppt", ".pptx", ".odp"],
    "Videos": [".mp4", ".mkv", ".avi", ".mov", ".wmv", ".flv", ".webm"],
    "Audio": [".mp3", ".wav", ".aac", ".flac", ".ogg", ".m4a"],
    "Archives": [".zip", ".rar", ".tar", ".gz", ".7z"],
    "Executables": [".exe", ".msi", ".bat", ".sh", ".apk"],
    "Code_Files": [".py", ".js", ".java", ".cpp", ".c", ".cs", ".html", ".css", ".php", ".swift", ".rb"],
    "Others": []  # Any unclassified files
}

def organiseFiles(directory):
  if not os.path.exists(directory):
    print("directory doesnt exist")
    return

  files=[f for f in os.listdir(directory) if os.path.isfile(os.path.join(directory,f))]

  for file in files:
    if file.startwith("."):
      continue
    file_path=os.path.join(directory,file)
    file_extension=os.path.splitext(file)[1].lower()

    folder_name=None
    for category,extensions in FILE_CATEGORIES.items():
      if file_extension in extensions:
        folder_name=category
        break
    if not folder_name:
      folder_name="others"

    folder_path=os.path.join(directory,folder_name)
    if not os.path.exists(folder_path):
      os.makedirs(folder_path)

    shutil.move(file_path,os.path.join(folder_path,file))
    print(f"moved {file} to {folder_name}")



if __name__ == "__main__":
    target_directory = input("Enter the directory to organize: ").strip()
    organiseFiles(target_directory)
    print("Organization complete!")
